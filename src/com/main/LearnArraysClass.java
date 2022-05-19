package com.main;

import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        //To manipulate primitive Array
        int[] numbers = {1, 2, 3, 4, 5, 9, 7, 8, 6, 10};
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println(index);

        Arrays.sort(numbers); //quick sort

        //parallel sort
        //Arrays.fill(numbers, 12);

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}

