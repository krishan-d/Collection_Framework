package com.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {

        //Queue<Integer> queue = new LinkedList();
        Queue<Integer> queue =  new PriorityQueue<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.add(4); //Throw Exception

        System.out.println(queue);

        //System.out.println(queue.poll());
        //System.out.println(queue.remove());

        queue.remove(2);  //Throw Exception
        System.out.println(queue);

        System.out.println("peek: " + queue.peek());
        int element = queue.element();  //Throw Exception
        System.out.println("element: " + element);

    }
}
