package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {

		/*
		List<Integer> sList = new ArrayList();
		sList.add(34);
		sList.add(12);
		sList.add(9);
		sList.add(76);
		sList.add(29);

		System.out.println(Collections.min(sList));
		System.out.println(Collections.max(sList));

		System.out.println(Collections.frequency(sList,9));

		Collections.sort(sList);
		System.out.println(sList);

		*/

        List<Person> pList = new ArrayList();

        pList.add(new Person("A",2));
        pList.add(new Person("Rv",4));
        pList.add(new Person("S",3));
        pList.add(new Person("Ra",1));

        System.out.println(pList);

        Person s1 = new Person("A",2);
        Person s2 = new Person("R",3);

        // System.out.println(s1.compareTo(s2));

        //Collections.sort(list);

        /*
         * Collections.sort(list, new Comparator<Student>() {
         *
         * @Override public int compare(Person o1, Person o2) { return
         * o1.name.compareTo(o2.name); }
         *
         * });
         */

        Collections.sort(pList, (o1,o2) -> o1.name.compareTo(o2.name));
        System.out.println(pList);

    }
}

