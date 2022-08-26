package com.main.Legacy_ds;

import java.util.*;

public class LearnHashTable {

    public static void main(String[] args) {
        /*
         * Hashtable:
         * Synchronized
         * No Null values or keys
         * Traversed by Enumerator and Iterator
         * Enumerator is not fail-safe in Hashtable
         * inherits Dictionary class
         * */

        /*
        Dictionary is an abstract class that represents a key/value storage repository and operates much like Map.

        Given a key and value, you can store the value in a Dictionary object.
        Once the value is stored, you can retrieve it by using its key.
        Thus, like a map, a dictionary can be thought of as a list of key/value pairs.

        The Dictionary class is obsolete.
        You should implement the Map interface to obtain key/value storage functionality.
        */

        // Create a hash map
        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;
        String str;
        double bal;

        balance.put("Zara", 3434.34);
        balance.put("Mahnaz", 123.22);
        balance.put("Ayan", 1378.00);
        balance.put("Daisy", 99.22);
        balance.put("Qadir", -19.08);

        System.out.println("balance = " + balance);

        // Show all balances in hash table.
        names = balance.keys();

        while (names.hasMoreElements()) {
            str = names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        // Deposit 1,000 into Zara's account

        bal = balance.get("Zara");
        balance.put("Zara", bal + 1000);
        System.out.println("Zara's new balance: " + balance.get("Zara"));


        //Properties class
        Properties capitals = new Properties();
        Set<Object> states;
        String str1;

        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");


        // Show all states and capitals in hashtable.

        states = capitals.keySet();   // get set-view of keys
        Iterator<Object> itr = states.iterator();

        while (itr.hasNext()) {
            str1 = (String) itr.next();
            System.out.println("The capital of " + str1 + " is " +
                    capitals.getProperty(str1) + ".");
        }
        System.out.println();


        // look for state not in list -- specify default
        str1 = capitals.getProperty("Florida", "Not Found");
        System.out.println("The capital of Florida is " + str1 + ".");
    }
}
