package com.main;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

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

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(0, "A");
        map.put(4, "Z");
        map.put(2, "F");
        map.put(6, "V");

        System.out.println("LinkedHashMap: " + map + "\n");
        map = new TreeMap<>(map);
        System.out.println("TreeMap: " + map + "\n");
        map = new HashMap<>(map);
        System.out.println("HashMap: " + map + "\n");

        map.remove(4);
        System.out.println(map + "\n");

        //override value for existing key
        map.put(6, "P");
        map.replace(0, "E");
        System.out.println(map + "\n");

        if (!map.containsKey(8)) map.put(8, "N");
        System.out.println(map + "\n");

        //Iterating...
        for (Map.Entry<Integer, String> e : map.entrySet()) System.out.println(e.getKey() + " : " + e.getValue());
        System.out.println();
        for (Integer key : map.keySet()) System.out.println(key);
        System.out.println();

        System.out.println("isEmpty: " + map.isEmpty());

        map.clear();
        System.out.println("clear: " + map + "\n");

    }
}

