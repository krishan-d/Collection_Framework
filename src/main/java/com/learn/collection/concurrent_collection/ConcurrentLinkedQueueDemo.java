package com.learn.collection.concurrent_collection;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {

    public static void main(String[] args) {

        /*
        * Unbounded Thread-safe queue which arranges the element in FIFO.
        *
        * */

        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        queue.add(1);
        queue.offer(10);

        Queue<Integer> queue2 = new PriorityQueue<>();
        queue2.add(0);
        queue2.add(1);
        queue2.add(7);

        queue.addAll(queue2);
        System.out.println("ConcurrentLinkedQueue : " + queue);

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 0));
        queue.removeAll(list);
        System.out.println("ConcurrentLinkedQueue : " + queue);

        queue.retainAll(new ArrayList<>(List.of(1)));
        System.out.println("ConcurrentLinkedQueue : " + queue);

    }
}
