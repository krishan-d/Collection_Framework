package com.learn.collection.collection_interface.set_interface;

import com.learn.collection.collections_class.Person;

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
		* Internal Implementation[DS]: backed by HashMap instance (uses HashTable)
		* 16 as initial size of HashTable
		* extends AbstractSet class
		* Not Thread-safe/Synchronized
		*
		* LinkedHashSet:
		* Time complexity O(1) [add, contains, remove]
		* Order: Insertion Order
		* Internal Implementation[DS]: uses HashTable & Doubly-LinkedList
		* 16 as initial size of HashTable
		* extends HashSet class
		* one null is allowed
		*
		* TreeSet:
		* Time complexity: O(log(n)) [add, contains, remove]
		* Order: Sorted Order [Ascending] or specified Comparator when initialized
		* Internal Implementation: backed by NavigableMap and TreeMap by default
		* extends AbstractSet class and implements NavigableSet interface
		* null is not allowed
		* */

		//LinkedHashSet() constructor
		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(4);
		Integer[] array = {1, -1, 0, 2, -2};
		lhs.addAll(Arrays.asList(array)); //[4, 1, -1, 0, 2, -2]

		//Hashing : unique hash code for each element
		//Duplicate element is not Added again
		lhs.add(4);
		lhs.add(null);
		System.out.println("LinkedHashSet: " + lhs + "\n");


		//HashSet
		Set<String> set = new HashSet<>();
		set.add("E0");
		set.add("E2");
		set.add("E1");
		set.add("E3");
		set.add("E4");

		//Create HashSet from another Collection
		Set<String> collectionSet = new HashSet<>(Arrays.asList("EL0", "EL2", "EL3", null));
		System.out.println("HashSet: " + collectionSet);


		//TreeSet
		TreeSet<String> set1 = new TreeSet<>();
		//set1.add(null); //raise NullPointerException
		set1.add("ELEMENT");
		System.out.println("TreeSet: " + set1);

		//TreeSet(Collection) constructor
		Set<String> sortedSet = new TreeSet<>(set); //Binary Search Tree Implemented
		System.out.println("sorted TreeSet: " + sortedSet + "\n");

		//TreeSet(Comparator) constructor
		Set<String> reverseSortedSet = new TreeSet<>(Comparator.reverseOrder());
		reverseSortedSet.addAll(set);
		System.out.println("TreeSet with comparator: " + reverseSortedSet + "\n");
		//or
		//TreeSet(sortedSet) constructor
		TreeSet<String> sortedSet1 = new TreeSet<>(sortedSet);


		//Set Methods
		System.out.println("contains(EL0): " + collectionSet.contains("EL0"));
		System.out.println("contains(NON-EXISTING ELEMENT): " + collectionSet.contains("NON-EXISTING ELEMENT"));
		System.out.println("isEmpty: " + collectionSet.isEmpty());
		System.out.println("Size: " + collectionSet.size());

		//removing elements
		collectionSet.remove("EL2");
		collectionSet.remove("NON-EXISTING ELEMENT");
		collectionSet.removeIf(Objects::isNull);
		System.out.println("hashSet : " + collectionSet);

		collectionSet.clear();
		System.out.println("Post clear operation: " + collectionSet + "\n");


		//Iteration
		for (String s : reverseSortedSet) System.out.println(s);
		//or
		//reverseSortedSet.forEach(System.out::println);
		//or
		//reverseSortedSet.stream().forEach(System.out::println);
		//or
		//for (Iterator<String> iterator = reverseSortedSet.iterator(); iterator.hasNext();)
		//	System.out.println(iterator.next());

		//or
		//reverseSortedSet.stream().filter(s -> !"E0".equals(s)).forEach(System.out::println);


		//Synchronized Set
		Set<String> syncSet = Collections.synchronizedSet(reverseSortedSet);
		System.out.println("synchronizedSet : " + syncSet);


		//Set containing Object
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Eve",2));
        personSet.add(new Person("A",4));
        personSet.add(new Person("Z",3));
        personSet.add(new Person("Pie",2));

        System.out.println("Person Set: " + personSet + "\n");
        //[Person{name='A', id=4}, Person{name='Eve', id=2}, Person{name='Z', id=3}, Person{name='Eve', id=2}]

        //After overriding hashcode and equal in Person class:
        //[Person{name='Eve', id=2}, Person{name='Z', id=3}, Person{name='A', id=4}]

        Person s1 = new Person("A",10);
        Person s2 = new Person("B",10);

        System.out.println("Is equal: " + s1.equals(s2));

    }
}

