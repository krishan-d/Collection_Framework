package com.learn.collection.collection_interface.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

    public static void main(String[] args) {

        //Collection Interface:

        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("A");
        stringCollection.add("B");
        stringCollection.add("C");

        System.out.println(stringCollection);

        stringCollection.remove("B");
        System.out.println(stringCollection);

        System.out.println(stringCollection.contains("A"));

        stringCollection.forEach((e) -> System.out.println(e));

        stringCollection.clear();
        System.out.println(stringCollection);
    }
}
