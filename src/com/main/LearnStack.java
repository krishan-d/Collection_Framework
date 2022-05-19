package com.main;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        Stack<Integer> sNum = new Stack();

        sNum.push(1);
        sNum.push(2);
        sNum.push(3);
        sNum.push(4);

        System.out.println("Stack: "+sNum);

        int peek = sNum.peek();
        System.out.println("peek: " + peek);

        int pop = sNum.pop();
        System.out.println("popped: " + pop);

        System.out.println(sNum);
    }
}

