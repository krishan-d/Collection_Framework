package com.learn.collection.collection_interface.list_interface;

import java.util.*;

public class ArrayListIterationTechniques {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("E1", "E2", "E0", "E2", null, "E3");

        //For-each
        for (String element : list) System.out.println(element);

        //Iterator
        System.out.println("\nIterator...");
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
            String element = iterator.next();
            System.out.println(element);
        }

        //ListIterator
        System.out.println("\nListIterator Forward Iteration...");
        ListIterator<String> stringIterator = list.listIterator();
        while (stringIterator.hasNext()) System.out.println(stringIterator.next());

        //Backward Iteration
        System.out.println("\nListIterator Backward Iteration...");
        while (stringIterator.hasPrevious()) System.out.println(stringIterator.previous());

        System.out.println("\nStream forEach method...");
        list.stream().filter(Objects::nonNull).forEach(System.out::println);

        System.out.println("\nArrayList forEach method...");
        list.forEach(System.out::println);
    }
}
