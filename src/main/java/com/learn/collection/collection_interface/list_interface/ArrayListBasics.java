package com.learn.collection.collection_interface.list_interface;

import com.learn.collection.model.Employee;

import java.util.*;

public class ArrayListBasics {
    public static void main(String[] args) {
        /*
         * ArrayList:
         * Stores a single value
         * Internally uses dynamic/resizing array to store elements [Increase or decrease size as per requirement]
         * Slow manipulation operations such as remove because of internal array
         * Better for storing and accessing elements
         *
         * Allows duplicate and null values
         * ArrayList is an ordered collection, which maintains insertion order for Elements.
         * Supports indexing.
         * ArrayList can't be created of primitive types like int, char...
         *
         * LinkedList:
         * Implements List, Queue, and Deque interfaces.
         * Stores data, previous and next address
         * Internally uses doubly-linked list
         * Faster manipulation operations
         * Better for manipulating elements
         * */

        /*
         * Automatic memory allocation:
         * Internal array of size 10 created
         * size n
         *     n + n/2 + 1   when needed
         * */

        //1. Create ArrayList From ArrayList() constructor
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("E0");
        arrayList.add(null);
        arrayList.add("E1");
        arrayList.add("E2");
        arrayList.add("E2");

        System.out.println("ArrayList: " + arrayList + " size: " + arrayList.size());

        //2. Create ArrayList From ArrayList(Collection) constructor
        List<Integer> primeNumbers0 = new ArrayList<>();
        primeNumbers0.add(1);
        primeNumbers0.add(3);
        primeNumbers0.add(5);

        List<Integer> morePrimeNumbers = new ArrayList<>(primeNumbers0);

        List<Integer> primeNumbers1 = new ArrayList<>();
        primeNumbers1.add(7);
        primeNumbers1.add(11);
        primeNumbers1.add(13);

        //addAll()
        morePrimeNumbers.addAll(primeNumbers1);
        System.out.println(morePrimeNumbers);


        //List of custom objects
        List<Employee> empList = new ArrayList<>(Arrays.asList(
                new Employee("A", 1000),
                new Employee("B", 1001),
                new Employee("C", 1002)
        ));
        System.out.println(empList);

        for (Employee e : empList) System.out.println(e.toString());

    }
}

