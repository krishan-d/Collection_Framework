package com.learn.collection.collection_interface.queue_interface;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(10);
        queue.add(10);
        queue.add(null);
        queue.add(4);

        System.out.println("Queue: " + queue);

        queue.poll(); // 1
        queue.remove(); // 2
        queue.remove(22); // This element does not exist in queue

        System.out.println("Queue: " + queue);

        System.out.println("peek: " + queue.peek());

        int element = queue.element();
        System.out.println("element: " + element);

    }
}
