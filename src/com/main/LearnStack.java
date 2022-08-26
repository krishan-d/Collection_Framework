package com.main;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class LearnStack {
    public static void main(String[] args) {

        Stack<Integer> sNum = new Stack<>();
        sNum.push(1);
        sNum.push(2);
        sNum.push(3);
        sNum.push(4);

        System.out.println(sNum + "\n");

        System.out.println("peek: " + sNum.peek());
        System.out.println("pop: " + sNum.pop());

        System.out.println(sNum + "\n");

        //Vector: Synchronized/Legacy class/100% increment capacity in need
        Vector<Integer> v = new Stack<>();
        //Vector<Integer> v1 = new Vector<>();
        v.add(1);
        v.add(0);
        v.add(4);
        v.add(2);
        System.out.println(v + "\n");
        //Traverse using Enumeration
        System.out.println("Using Enumeration to iterate:");
        Enumeration<Integer> enumeration = v.elements();
        while (enumeration.hasMoreElements()) System.out.println(enumeration.nextElement());

        System.out.println("\nUsing Iterator to iterate:");
        Iterator<Integer> itr = v.iterator();
        while (itr.hasNext()) System.out.println(itr.next());
        System.out.println();

        for (Integer i : v)  System.out.println(i);
    }
}

