package com.learn.collection.concurrent_collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class ConcurrentHashMapDemo {

    /*
    * ConcurrentHashMap:
    * ConcurrentHashMap is an enhancement of HashMap in multi Threaded environment.
    *
    * 1. Internal implementation: Hashtable
    * 2. Thread-safe i.e. multiple Threads can operate on a single object without any complications.
    * 3. At a time any number of Threads are applicable for a read operation without locking the ConcurrentHashMap object
    * which is not there in HashMap.
    * 4. ConcurrentHashMap is divided into a number of segments according to the concurrency level.
    * 5. DEFAULT CONCURRENCY LEVEL is 16.
    * 6. For update/ write operation, Thread must lock the particular segment in which the thread wants to operate.
    * This type of locking mechanism is known as Segment Locking/ Bucket Locking.
    * Hence, at a time 16 update operations can be performed by threads.
    * 7. Null keys and null values are not allowed.
    *
    * Declaration:
    * public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable
    *
    * Constructors:
    * Concurrency-level: Number of segments or threads concurrently updating map.
    * Load-factor: Threshold, used to control resizing.
    * InitialCapacity
    * */

    public static void main(String[] args) {

        /*
        * //ConcurrentHashMap()
        * ConcurrentHashMap<Integer, String> map0 = new ConcurrentHashMap<>(); //Default capacity 16
        * //ConcurrentHashMap(initialCapacity)
        * ConcurrentHashMap<Integer, String> map1 = new ConcurrentHashMap<>(20);
        * //ConcurrentHashMap(initialCapacity, loadFactor)
        * ConcurrentHashMap<Integer, String> map2 = new ConcurrentHashMap<>(20, 0.70F);
        * //ConcurrentHashMap(initialCapacity, loadFactor, concurrencyLevel)
        * ConcurrentHashMap<Integer, String> map3 = new ConcurrentHashMap<>(20, 0.70F, 20);
        */

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "A");
        hashMap.put(2, "E");

        //ConcurrentHashMap(map):
        //Creates a new map with the same mapping as given map
        ConcurrentHashMap<Integer, String> map4 = new ConcurrentHashMap<>(hashMap);
        map4.put(4, "I");
        map4.put(5, "L");
        System.out.println("ConcurrentHashMap = " + map4);

        map4.putIfAbsent(4, "H"); //Hence, 4 is in map already it will not add or update value
        map4.putIfAbsent(3, "F");
        System.out.println("ConcurrentHashMap = " + map4);

        map4.remove(5);

        map4.replace(4, "I", "H");
        System.out.println("ConcurrentHashMap = " + map4);

        //Accessing elements
        System.out.println("key=1 : value=" + map4.get(1));

        if (!map4.isEmpty()) System.out.println("MAP IS NOT EMPTY");
        //contains(value)
        System.out.println("map4.contains(\"A\") : " + map4.contains("A"));
        //containsKey(key)
        System.out.println("map4.containsKey(7) = " + map4.containsKey(7));
        //containsValue(value)
        System.out.println("map4.containsValue(\"NON-EXISTING VALUE\") = " + map4.containsValue("NON-EXISTING VALUE"));


        //remapping..
        //compute(key, remappingFunction)
        /*
        * map4.compute(1, new BiFunction<Integer, String, String>() {
        *     @Override
        *     public String apply(Integer key, String value) {
        *         return (value != null) ? "NOT NULL" : "NULL";
        *     }
        * });
        * */

        //or
        map4.compute(1, (key, value) -> (value != null) ? "NOT NULL" : "NULL");
        System.out.println("ConcurrentHashMap.compute : " + map4);

        //keys()
        Enumeration<Integer> enumeration = map4.keys();
        while (enumeration.hasMoreElements()) System.out.println(enumeration.nextElement());

        //values()
        Collection<String> values = map4.values();
        System.out.println("Collection of values : " + values);

        //map4.clear();


        //Traversing...
        /*
        * for (Map.Entry<Integer, String> entry : map4.entrySet()) {
        *     System.out.println("key = " + entry.getKey() + " : value = " + entry.getValue());
        * }
        * */

        //or
        /*
        * Iterator<Map.Entry<Integer, String>> iterator = map4.entrySet().iterator();
        * while (iterator.hasNext()) {
        *     Map.Entry<Integer, String> entry = iterator.next  ();
        *     System.out.println("key = " + entry.getKey() + " : value = " + entry.getValue());
        * }
        * */

        //or
        /*
        * map4.forEach(new BiConsumer<>() {
        *     @Override
        *     public void accept(Integer i, String s) {
        *         System.out.println("key = " + i + " : value = " + s);
        *     }
        * });
        * */

        //or
        System.out.println();
        map4.forEach((i, s) -> System.out.println("key = " + i + " : value = " + s));

    }
}
