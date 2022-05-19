package com.main;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

    public static void main(String[] args) {

        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        //Passing Comparator in constructor
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.add(36);

        System.out.println(pq); //Min Heap

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

    }
}

