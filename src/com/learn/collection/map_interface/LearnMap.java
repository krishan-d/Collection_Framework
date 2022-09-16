package com.learn.collection.map_interface;

import java.util.*;
import java.util.function.BiConsumer;

public class LearnMap {
    public static void main(String[] args) {

        /*
        Key-Value Pairs
        Unique Key

        HashMap:
        implement Map interface.
        HashMap is implemented as HashTable.
        No order is maintained[Any order] hence High performance
        O(1) Time complexity [get, put, containsKey, remove]
        General purpose Map

        LinkedHashMap:
        implement Map interface.
        LinkedHashMap is implemented as a Doubly-LinkedList buckets.
        Order in which keys were inserted into Map.

        TreeMap:
        implement Map, NavigableMap and SortedMap interface.
        TreeMap is implemented as Red-Black Tree.
        Iterated according to the natural order or the Comparator specified while creation.
        O(log(n)) Time complexity [get, put, containsKey, remove]
        No null keys
        */

        //LinkedHashMap
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(0, "A");
        map.put(4, "Z");
        map.put(2, "F");
        map.put(6, "V");
        System.out.println("LinkedHashMap: " + map + "\n");


        //TreeMap
        map = new TreeMap<>(map);
        //map.put(null, "NULL-KEY"); // raise NullPointerException
        System.out.println("TreeMap: " + map + "\n");

        //TreeMap with Comparator
        Map<Integer, String> map1 = new TreeMap<>(Comparator.reverseOrder());
        map1.putAll(map);
        System.out.println("TreeMap with Comparator: " + map1 + "\n");


        //HashMap
        /*
        * Map<Integer, String> hashMap0 = new HashMap<>();
        * Map<Integer, String> hashMap1 = new HashMap<>(20); // Default capacity 16
        * Map<Integer, String> hashMap2 = new HashMap<>(20, 0.70F); // Load factor 70%
        * */
        //or
        Map<Integer, String> hashMap = new HashMap<>(map);

        //HashMap as synchronized
        Map<Integer, String> synMap = Collections.synchronizedMap(hashMap);
        System.out.println("Synchronized HashMap: " + synMap + "\n");

        //Operations...
        hashMap.remove(4);
        System.out.println(hashMap + "\n");

        //override value for existing key
        hashMap.put(6, "P");
        hashMap.replace(0, "E");
        System.out.println(hashMap + "\n");

        if (!hashMap.containsKey(8)) hashMap.put(8, "N");
        if (!hashMap.containsValue("A")) hashMap.put(0, "A");
        System.out.println(hashMap + "\n");


        //Iterating...
        for (Map.Entry<Integer, String> e : hashMap.entrySet()) System.out.println(e.getKey() + " : " + e.getValue());
        //or
        //for (Integer key : hashMap.keySet()) System.out.println(key);
        //or
        //for (String str : hashMap.values()) System.out.println(str);
        //or
        /*
        * Iterator<Map.Entry<Integer, String>> entryIterator = hashMap.entrySet().iterator();
        * while (entryIterator.hasNext()) {
        *     System.out.println(entryIterator.next().getKey() + " : " + entryIterator.next().getValue());
        * }
        * */

        //or
        /*
        * hashMap.forEach(new BiConsumer<>() {
        *     @Override
        *     public void accept(Integer i, String s) {
        *         System.out.println(i + " : " + s);
        *     }
        * });
        * */
        //or
        hashMap.forEach((i, s) -> System.out.println(i + " : " + s));


        if (!hashMap.isEmpty()) map.clear();

        /*
        * Hashtable:
        * Synchronized
        * No Null values or keys
        * Traversed by Enumerator and Iterator
        * Enumerator is not fail-safe in Hashtable
        * inherits Dictionary class
        * */

        Hashtable<Integer, String> hm = new Hashtable<>();
        hm.put(1, "A");
        hm.put(-1, "B");
        hm.put(0, "C");
        hm.put(2, "D");
        hm.put(-2, "E");

        for (Map.Entry<Integer, String> m : hm.entrySet()) System.out.println(m.getKey() + " : " + m.getValue());

    }
}

