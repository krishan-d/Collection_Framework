package com.learn.collection.collection_interface.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class LearnArrayDeque {
    public static void main(String[] args) {

        //Deque interface and LinkedList class
        Deque<String> deque = new LinkedList<>();
        deque.add("El 1 [Tail]");
        deque.addFirst("El 2 [Head]");
        deque.addLast("El 3 [Tail]");
        deque.push("El 4 [Head]");
        deque.offer("El 5 [Tail]");
        deque.offerFirst("El 6 [Head]");
        deque.offerLast("El 7 [Tail]");
        System.out.println(deque + "\n");

        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque after removing First and Last: " + deque + "\n");

        //Deque interface and ArrayDeque class
        Deque<String> de_que = new ArrayDeque<>();
        de_que.add("E1");
        de_que.addFirst("E2");
        de_que.addLast("E3");
        de_que.push("E4");
        de_que.offer("E5");
        de_que.offerFirst("E6");
        de_que.offerLast("E7");
        de_que.add("E1");
        de_que.add("E8");

        System.out.println(de_que + "\n");
        System.out.println("pop: " + de_que.pop());
        System.out.println("poll: " + de_que.poll());
        System.out.println("pollFirst: " + de_que.pollFirst());
        System.out.println("pollLast: " + de_que.pollLast());

        de_que.removeFirstOccurrence("E1");
        de_que.remove();
        System.out.println(de_que + "\n");

        System.out.println("Iterator...");
        for (Iterator<String> itr = de_que.iterator(); itr.hasNext();) System.out.println(itr.next());
        System.out.println("Descending Iterator...");
        for (Iterator<String> itr = de_que.descendingIterator(); itr.hasNext();) System.out.println(itr.next());
        System.out.println();

        //Using ArrayDeque class
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        try {
            adq.add(5);
            adq.offer(23);
            adq.offerFirst(12);
            adq.offerLast(45);
            adq.add(26);

            System.out.println(adq + "\n");

            System.out.println("peek: " + adq.peek());
            System.out.println("peekFirst: " + adq.peekFirst());
            System.out.println("peekLast: " + adq.peekLast());

            System.out.println("poll: " + adq.poll());
            System.out.println("pollFirst: " + adq.pollFirst());
            System.out.println("pollLast: " + adq.pollLast());
            System.out.println(adq + "\n");
        }
        catch(Exception e){
            System.out.println("Exception : " + e.getMessage());
        }
    }
}


