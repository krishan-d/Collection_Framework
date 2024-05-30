package com.learn.collection.collection_interface.queue_interface;

import java.util.*;
import java.util.function.Consumer;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        /*
        * Priority Queue:
        * In Queue, FIFO is implemented whereas, in priority queue, values are removed on the basis of priority
        * Rear: contains the greatest element and Front: contains the least element
        * Remove: The Least element [Front] according to the specified ordering is removed first
        * */

        //1. PriorityQueue() constructor
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //default comparator //Min Heap //Initial capacity 11
        /*
        * PriorityQueue<Integer> pq1 = new PriorityQueue<>(20);
        * PriorityQueue<Integer> pq2 = new PriorityQueue<>(new HashSet<>(Arrays.asList(7, 3, 0, 2)));
        * PriorityQueue<Integer> pq3 = new PriorityQueue<>(Arrays.asList(7, 3, 0, 2));
        * PriorityQueue<Integer> pq4 = new PriorityQueue<>(pq2);
        * */

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.add(36);
        pq.add(10);
        pq.add(27);
        //pq.add(null); //NullPointerException
        System.out.println(pq); //Min Heap

        System.out.println("head:" + pq.element());
        System.out.println("head:" + pq.peek());

        //Iteration over priority queue
        for (Integer integer : pq) System.out.println(integer);

        pq.remove(); // remove head - 10
        System.out.println("\nPriority Queue: " + pq);
        pq.remove(36); // remove - 36
        pq.poll(); // remove new head - 12
        System.out.println("\nPriority Queue: " + pq);

        //Remove items from priority queue [dequeue]
        while (!pq.isEmpty()) System.out.println("Removed: " + pq.remove());

        //2. PriorityQueue(Comparator) constructor i.e. Passing Comparator in constructor
        PriorityQueue<Integer> pqRev = new PriorityQueue<>(Comparator.reverseOrder());
        pqRev.add(20);
        pqRev.add(34);
        pqRev.add(60);
        pqRev.add(17);
        pqRev.add(40);

        //Iteration...
        Iterator<Integer> itr = pqRev.iterator();
        while (itr.hasNext()) { System.out.println(itr.next()); }

        //Remove items from priority queue with comparator [dequeue]
        while (!pqRev.isEmpty()) System.out.println("Removed: " + pqRev.remove());
        System.out.println();


        //1. PriorityQueue() constructor
        PriorityQueue<String> namePq = new PriorityQueue<>();

        namePq.add("Lisa");
        namePq.add("Hooper");
        namePq.add("Eve");
        namePq.add("Krishna");
        namePq.add("Anna");
        namePq.add("Edwina");

        PriorityQueue<String> copyPq = new PriorityQueue<>();
        copyPq.addAll(namePq);

        //Iteration...
        for (String name : namePq) System.out.println(name);
        //or
        while (!namePq.isEmpty()) System.out.println("Removed: " + namePq.remove());
        System.out.println();

        //2. PriorityQueue(Comparator) constructor

        //A. Anonymous object implementation
        /*
        * Comparator<String> stringLengthComparator = new Comparator<String>() {
        *     @Override
        *     public int compare(String o1, String o2) {
        *         return o1.length() - o2.length();
        *     }
        * };
        * */

        //or
        //B. Lambda Expression
        //Comparator<String> stringLengthComparator = (o1, o2) -> o1.length() - o2.length();

        //or
        //3. Method reference
        Comparator<String> stringLengthComparator = Comparator.comparingInt(String::length);
        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);
        namePriorityQueue.addAll(copyPq);
        namePriorityQueue.add("MR");
        namePriorityQueue.add("El");

        System.out.println("PriorityQueue: " + namePriorityQueue);

        boolean b0 = namePriorityQueue.remove("NON-EXISTING ELEMENT"); //False
        boolean b1 = namePriorityQueue.removeIf(s -> s.length() < 3); //True

        System.out.println("PriorityQueue: " + namePriorityQueue);

        //Iterating over PriorityQueue
        //for (String name : namePriorityQueue) System.out.println(name);

        //or
        /*
        * Iterator<String> nameIterator = namePriorityQueue.iterator();
        * while (nameIterator.hasNext()) System.out.println(nameIterator.next());
        */

        //or
        //System.out.println();
        //namePriorityQueue.stream().filter(s -> !"Hooper".equals(s)).forEach(System.out::println);

        //or
        //namePriorityQueue.stream().forEachOrdered(System.out::println);

        //or
        namePriorityQueue.forEach(System.out::println);

        //or
        while (!namePriorityQueue.isEmpty()) System.out.println("Removed: " + namePriorityQueue.remove());

    }
}

