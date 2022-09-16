package com.learn.collection.collections_class;

import java.util.*;

public class LearnCollectionsClass {
    public static void main(String[] args) {

		List<Integer> sList = new ArrayList<>(Arrays.asList(1, -1, 0, 2, -2));
		sList.add(4);

        System.out.println("ArrayList: " + sList + "\n");
		System.out.println("Min: " + Collections.min(sList));
		System.out.println("max: " + Collections.max(sList));

		System.out.println("Frequency: " + Collections.frequency(sList,9));

		Collections.sort(sList);
		System.out.println("sorted ArrayList: " + sList + "\n");


        //ArrayList with Object Type
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("A",2));
        personList.add(new Person("Rv",4));
        personList.add(new Person("S",3));
        personList.add(new Person("Ra",1));

        System.out.println("ArrayList: " + personList + "\n");

        //compareTo
        Person s1 = new Person("A",2);
        Person s2 = new Person("R",3);
        System.out.println("compareTo: " + s1.compareTo(s2));

        Collections.sort(personList);
        System.out.println("Sorted ArrayList (comparing id member variable): " + personList);

        //or
        /*
        Collections.sort(personList, new Comparator<>() {
             @Override
             public int compare(Person o1, Person o2) {
                 return o1.name.compareTo(o2.name);
             }
        });
        */

        //or
        //Collections.sort(personList, (o1,o2) -> o1.name.compareTo(o2.name));

        //or
        /*
        Collections.sort(personList, Comparator.comparing(o -> o.name));
        System.out.println("Sorted ArrayList (comparing name member variable): " + personList);
        */

        //or
        Collections.sort(personList, new NameComparator());
        System.out.println("Sorted ArrayList (using custom comparator): " + personList);

    }
}
