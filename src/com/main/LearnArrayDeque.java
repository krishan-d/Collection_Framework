package com.main;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        try{
            adq.offer(23);
            adq.offerFirst(12);
            adq.offerLast(45);
            adq.offer(26);

            System.out.println(adq);

            int peek = adq.peek();
            System.out.println("peek : " + peek);

            int peekF = adq.peekFirst();
            int peekL = adq.peekLast();
            System.out.println("peek First: " + peekF + " | peek Last: " + peekL);

            int x = adq.poll();
            System.out.println("Polled Element: " + x);

            System.out.println("Array :" + adq);
            System.out.println(adq.pollFirst());
            System.out.println(adq);
            System.out.println(adq.pollLast());
            System.out.println(adq);
        }
        catch(Exception e){
            System.out.println("Exception : " + e.getMessage());
        }
    }
}


