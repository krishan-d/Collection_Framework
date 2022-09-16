package com.learn.collection.collection_interface.queue_interface;

import java.util.*;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        /*
        * Priority Queue:
        * In Queue, FIFO is implemented whereas, in priority queue, values are removed on the basis of priority
        * Rear: contains the greatest element and Front: contains the least element
        * Remove: The Least element [Front] according to the specified ordering is removed first
        * */

        PriorityQueue<Integer> pq = new PriorityQueue<>(); //default comparator //Min Heap //Initial capacity 11
        /*
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(20);
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(new HashSet<>(Arrays.asList(7, 3, 0, 2)));
        PriorityQueue<Integer> pq3 = new PriorityQueue<>(Arrays.asList(7, 3, 0, 2));
        PriorityQueue<Integer> pq4 = new PriorityQueue<>(pq2);
        */

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.add(36);
        pq.add(10);
        pq.add(27);
        System.out.println(pq); //Min Heap

        System.out.println("head:" + pq.element());
        System.out.println("head:" + pq.peek());

        for (Integer integer : pq) System.out.println(integer);

        pq.remove();
        pq.remove(36);
        pq.poll(); //10

        System.out.println("Priority Queue: " + pq);
        //Remove items from priority queue [dequeue]
        while (!pq.isEmpty()) System.out.println("Removed: " + pq.remove());

        //Passing Comparator in constructor, PriorityQueue(Comparator) constructor
        PriorityQueue<Integer> pqRev = new PriorityQueue<>(Comparator.reverseOrder());
        pqRev.add(20);
        pqRev.add(34);
        pqRev.add(60);
        pqRev.add(17);
        pqRev.add(40);

        Iterator<Integer> itr = pqRev.iterator();
        while (itr.hasNext()) { System.out.println(itr.next()); }
        //Remove items from priority queue with comparator [dequeue]
        while (!pqRev.isEmpty()) System.out.println("Removed: " + pqRev.remove());
        System.out.println();


        PriorityQueue<String> namePq = new PriorityQueue<>();
        namePq.add("Lisa");
        namePq.add("Hooper");
        namePq.add("Eve");
        namePq.add("Krishna");
        namePq.add("Anna");
        namePq.add("Edwina");

        //for (String name : namePq) System.out.println(name);
        //or
        while (!namePq.isEmpty()) System.out.println("Removed: " + namePq.remove());
        System.out.println();

        //Anonymous object implementation
        /*
        * Comparator<String> stringLengthComparator = new Comparator<String>() {
        *     @Override
        *     public int compare(String o1, String o2) {
        *         return o1.length() - o2.length();
        *     }
        * };
        */
        //or
        //Lambda Expression
        //Comparator<String> stringLengthComparator = (o1, o2) -> o1.length() - o2.length();
        //or
        //Method reference
        Comparator<String> stringLengthComparator = Comparator.comparingInt(String::length);

        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);
        //namePriorityQueue.addAll(namePq);
        //or
        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("Hooper");
        namePriorityQueue.add("Eve");
        namePriorityQueue.add("Krishna");
        namePriorityQueue.add("Anna");
        namePriorityQueue.add("Edwina");


        //Iterating
        for (String name : namePriorityQueue) System.out.println(name);
        //or
        /*
        * Iterator<String> nameIterator = namePriorityQueue.iterator();
        * while (nameIterator.hasNext()) System.out.println(nameIterator.next());
        */
        //or
        System.out.println();
        namePriorityQueue.stream().filter(s -> !"Hooper".equals(s)).forEach(System.out::println);
        //or
        //namePriorityQueue.stream().forEachOrdered(System.out::println);
        //or
        //while (!namePriorityQueue.isEmpty()) System.out.println("Removed: " + namePriorityQueue.remove());

    }
}

