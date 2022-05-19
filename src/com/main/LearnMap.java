package com.main;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class LearnMap {
    public static void main(String[] args) {

        /*
        Key-Value Pairs
        Unique Key
        */

        //Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map = new TreeMap<>();  //Sorted by key

        map.put("A", 1);
        map.put("Z", 10);
        map.put("F", 17);
        //map.put("V", 27);


        map.remove("F");
        System.out.println(map); //{A=1, F=7, Z=10}

        //map.put("F", 7); //override value
        //System.out.println(map); //{A=1, F=17, Z=10}

        //if (!map.containsKey("F")) map.put("F", 7);

        //System.out.println(map);

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.isEmpty());

        map.clear();
        System.out.println(map);

    }
}

