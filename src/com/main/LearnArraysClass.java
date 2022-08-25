package com.main;

import java.util.Arrays;
import java.util.List;

public class LearnArraysClass {
    public static void main(String[] args) {
        //To manipulate primitive Array
        int[] numbers = {1, 2, 3, 4, 5, 9, 7, 8, 6, 10};
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println(index);

        Arrays.sort(numbers); //quick sort

        //parallel sort
        //Arrays.fill(numbers, 12);

        for (int i : numbers) System.out.print(i + " ");
        System.out.println();

        int[] ar = {4, 6, 1, 8, 3, 9, 7, 4, 2};
        int[] ar1 = {};
        int[][] ar2 = {{7}, {4, 6}};
        List<Integer> array = Arrays.asList(1, 0, 3, 6, 9, 7, 4, 2);
        //List<Integer> arrayList1 = Arrays.asList(ar1); //CTE
        System.out.println(array);

        System.out.println("Array To String: " + Arrays.toString(ar));
        System.out.println("binarySearch: " + Arrays.binarySearch(ar, 0));
        System.out.println("compare: " + Arrays.compare(ar, ar1)); //-1
        int[] copyOfArray = Arrays.copyOf(ar, 5);
        System.out.println("Array copy: " + Arrays.toString(copyOfArray));

        System.out.println("copy from index 3 to 7 : " + Arrays.toString(Arrays.copyOfRange(ar, 3, 7)));

        System.out.println("deepToString: " + Arrays.deepToString(ar2));
        System.out.println("deepHashCode: " + Arrays.deepHashCode(ar2));

        System.out.println("equals: " + Arrays.equals(ar, ar1));
        Arrays.fill(ar1, 0);
        System.out.println("fill: " + Arrays.toString(ar1));

        System.out.println("hashCode: " + Arrays.hashCode(ar));
        System.out.println("mismatch: " + Arrays.mismatch(ar, ar1));
        System.out.println("spliterator: " + Arrays.spliterator(ar));

        Arrays.sort(ar);
        System.out.println("sorted array: " + Arrays.toString(ar));

        System.out.println("stream: " + Arrays.stream(ar));
        //stream operations:
        Arrays.stream(ar).forEach(System.out::println);
        System.out.println();
        Arrays.stream(ar).filter(x -> (x > 2) && (x < 8)).forEach(System.out::println);

        //Wrapper List over array[]
        Integer[] ar3 = {6, 7, 3, 8, 0, 2, 5, 0};
        System.out.println("\nArray: " + Arrays.toString(ar3));
        List<Integer> arrayList = Arrays.asList(ar3);
        System.out.println(arrayList);

        Arrays.sort(ar3);
        System.out.println(Arrays.toString(ar3));
    }
}

