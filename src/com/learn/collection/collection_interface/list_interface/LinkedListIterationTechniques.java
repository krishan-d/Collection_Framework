package com.learn.collection.collection_interface.list_interface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class LinkedListIterationTechniques {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("E1");
        linkedList.add("E2");
        linkedList.add("E3");
        linkedList.add("DUPLICATE");
        linkedList.add(null);
        linkedList.add("DUPLICATE");

        boolean result = linkedList.contains("E2");
        System.out.println("result = " + result);

        int index = linkedList.indexOf("NON-EXISTING ELEMENT"); //-1
        System.out.println("index = " + index);

        int lastIndex = linkedList.lastIndexOf("DUPLICATE");
        System.out.println("lastIndex = " + lastIndex + "\n");

        //Iterator
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Lambda Expression
        linkedList.forEach(element -> System.out.println(element));

        //Method reference
        linkedList.forEach(System.out::println);

        //Enhanced for
        for (String str : linkedList) System.out.println(str);

        //Stream
        linkedList.stream().filter(Objects::nonNull).forEach(System.out::println);

    }
}
