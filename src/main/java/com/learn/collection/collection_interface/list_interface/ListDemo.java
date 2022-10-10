package com.learn.collection.collection_interface.list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        //List creation
        List<String> list = new ArrayList<>();
        //OR
        List<String> linkedList = new LinkedList<>();

        //List allows duplication
        list.add("E1");
        list.add("E1");

        //List allows null Elements
        list.add(null);

        //List maintains insertion order
        list.add("E2");
        list.add("E3");
        list.add("E4");

        System.out.println("List: " + list);

        //Accessing Elements form List
        System.out.println(list.get(0));
        System.out.println(list.get(4));
    }
}
