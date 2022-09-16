package com.learn.collection.collection_interface.list_interface;

import java.util.*;

public class LinkedListBasics {

    public static void main(String[] args) {

        /*
        * LinkedList:
        * Implements List, Queue, and Deque interfaces.
        * Stores data, previous and next address
        * Internally uses doubly-linked list, Thus consumes more memory than ArrayList
        * Faster manipulation operations
        * Better for manipulating elements
        * */

        //LinkedList() constructor
        LinkedList<Integer> linkedList = new LinkedList<>();
        //or
        //List<Integer> list = new LinkedList<>();

        //add(e)
        //add(index, element)
        //addFirst(e)
        //addLast(e)

        linkedList.add(1);
        linkedList.add(null);
        linkedList.add(-1);

        linkedList.add(0, 2);

        linkedList.addFirst(0);
        linkedList.addLast(-2);

        System.out.println("LinkedList: " + linkedList);

        //addAll
        //LinkedList(Collection) constructor
        List<Integer> list = new LinkedList<>(Arrays.asList(4, 0, -1, null));
        linkedList.addAll(list);

        System.out.println("LinkedList: " + linkedList);


        //Retrieving elements
        System.out.println("1ST Element: " + linkedList.getFirst());
        System.out.println("End Element: " + linkedList.getLast());

        System.out.println(linkedList.get(2));


        //Removing elements

        //removeFirst()
        //removeLast()
        //remove()
        //remove(index)
        //remove(Object o)
        //removeFirstOccurrence(e)
        //removeLastOccurrence(e)
        //clear()

        List<Integer> list1 = Arrays.asList(2, -1, null, 0, null, -1, 0, -1, null, 4);
        LinkedList<Integer> linkedList1 = new LinkedList<>(list1);


        Integer removedElement = linkedList1.removeFirst(); //2
        Integer removedLastElement = linkedList1.removeLast(); //4

        linkedList1.remove(0); //-1  //remaining list: [null, 0, null, -1, 0, -1, null]
        linkedList1.remove(Integer.valueOf(-1)); //-1  //remaining list: [null, 0, null, 0, -1, null]

        linkedList1.remove(); //null  //remaining list: [null, 0, null, 0, -1]

        linkedList1.removeFirstOccurrence(-1); //remaining list: [null, 0, null, 0]
        linkedList1.removeLastOccurrence(0); //remaining list: [null, 0, null]

        linkedList1.removeIf(Objects::isNull);  //remaining list: [0]
        System.out.println("Linked List: " + linkedList1);

        linkedList1.clear();

    }
}
