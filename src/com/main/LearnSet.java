package com.main;

import java.util.*;

public class LearnSet {
    public static void main(String[] args) {

		/*
		* No duplicate elements allowed
		* Not Thread-safe/ Not synchronized
		* Fail-Fast iterator
		*
		* HashSet:
		* Time complexity: O(1) [add, contains, remove]
		* Order: No Order
		* Internal Implementation[DS]: backed by HashMap instance uses HashTable
		* 16 as initial size of HashTable
		* extends AbstractSet class
		*
		* LinkedHashSet:
		* Time complexity O(1) [add, contains, remove]
		* Order: Insertion Order
		* Internal Implementation[DS]: uses HashTable & Doubly-LinkedList
		* 16 as initial size of HashTable
		* extends HashSet class
		*
		* TreeSet:
		* Time complexity: O(log(n)) [add, contains, remove]
		* Order: Sorted Order [Ascending] or specified Comparator when initialized
		* Internal Implementation: backed by NavigableMap and TreeMap by default
		* extends AbstractSet class and implements NavigableSet interface
		* */

		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(4);
		Integer[] array = {1, -1, 0, 2, -2};
		lhs.addAll(Arrays.asList(array));

		//Hashing : unique hash code for each element
		lhs.add(2); //Not Added again
		System.out.println("LinkedHashSet: " + lhs + "\n");

		Set<Integer> sortedSet = new TreeSet<>(lhs);//Binary Search Tree Implemented
		System.out.println("TreeSet: " + sortedSet + "\n");

		Set<Integer> sortedSet1 = new TreeSet<>(Comparator.reverseOrder());
		sortedSet1.addAll(lhs);
		System.out.println("TreeSet with comparator: " + sortedSet1 + "\n");

		Set<Integer> set = new HashSet<>(sortedSet);
		System.out.println("HashSet: " + set + "\n");

		//removing elements
		set.remove(65);

		System.out.println("contains(21): " + set.contains(21));
		System.out.println("isEmpty: " + set.isEmpty());
		System.out.println("Size: " + set.size());

		set.clear();
		System.out.println("Post clear operation: " + set + "\n");

        //Set
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Eve",2));
        personSet.add(new Person("A",4));
        personSet.add(new Person("Z",3));
        personSet.add(new Person("Pie",2));

        System.out.println("HashSet: " + personSet + "\n");
        //[Person{name='A', id=4}, Person{name='Eve', id=2}, Person{name='Z', id=3}, Person{name='Eve', id=2}]

        //overriding hashcode in Person class:
        //equals and hashcode override afterwards:
        //[Person{name='Eve', id=2}, Person{name='Z', id=3}, Person{name='A', id=4}]

        Person s1 = new Person("A",10);
        Person s2 = new Person("B",10);

        System.out.println("Is equal: " + s1.equals(s2));

    }
}

