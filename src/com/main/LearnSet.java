package com.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
		/*
		//No duplicate elements allowed

		//Set<Integer> set = new HashSet<>();  //O(1) All operations
		//Set<Integer> set = new LinkedHashSet<>();

		Set<Integer> set = new TreeSet<>(); //O(log n)//Binary Search Tree Implemented

		set.add(32);
		set.add(2);
		set.add(54);
		set.add(21);
		set.add(65);
		//Hashing
		//unique hash code for each element

		//set.add(54); //Not Added again
		//set.remove(54);

		System.out.println(set);
		//HashSet [32, 65, 2, 21, 54]
		//LinkedHashSet [32, 2, 54, 21, 65] In order as added
		//TreeSet [2, 21, 32, 54, 65] In order/sorted Form

		System.out.println(set.contains(21));

		System.out.println(set.isEmpty());

		System.out.println(set.size());

		set.clear();
		System.out.println(set);

		*/

        Set<Person> personSet = new HashSet<>();

        personSet.add(new Person("Eve",2));
        personSet.add(new Person("A",4));
        personSet.add(new Person("Z",3));
        personSet.add(new Person("Pie",2));

        System.out.println(personSet);
        //[Person{name='A', id=4}, Person{name='Eve', id=2}, Person{name='Z', id=3}, Person{name='Eve', id=2}]

        //overriding hashcode in Person class:
        //equals and hashcode override afterwards:
        //[Person{name='Eve', id=2}, Person{name='Z', id=3}, Person{name='A', id=4}]

        Person s1 = new Person("A",10);
        Person s2 = new Person("B",10);

        System.out.println(s1.equals(s2));


    }
}

