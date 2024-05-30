package com.learn.collection.arrays_class;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;

//Arrays class is not a part of Collection Framework
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

        // Array creation
        int[] ar = {4, 6, 1, 8, 3, 9, 7, 4, 2};
        int[] ar1 = {};
        int[][] ar2 = {{7}, {4, 6}};
        List<Integer> array = Arrays.asList(1, 0, 3, 6, 9, 7, 4, 2);
        //List<Integer> arrayList1 = Arrays.asList(ar1); //CTE
        System.out.println(array);

        // Arrays.toString(array)
        System.out.println("Array To String: " + Arrays.toString(ar));
        // Arrays.binarySearch(array, key)
        System.out.println("binarySearch: " + Arrays.binarySearch(ar, 0));
        // Arrays.compare(array1, array2)
        System.out.println("compare: " + Arrays.compare(ar, ar1)); //-1
        // Arrays.copyOf(array, size)
        int[] copyOfArray = Arrays.copyOf(ar, 5);
        System.out.println("Array copy: " + Arrays.toString(copyOfArray));

        // Arrays.copyOfRange(array, start, end)
        System.out.println("copy from index 3 to 7 : " + Arrays.toString(Arrays.copyOfRange(ar, 3, 7)));

        // Arrays.deepToString(array) : For Nested arrays or Matrix
        System.out.println("deepToString: " + Arrays.deepToString(ar2)); // deepToString: [[7], [4, 6]]
        System.out.println(Arrays.toString(ar2)); // [[I@279f2327, [I@2ff4acd0]
        // Arrays.deepHashCode(array)
        System.out.println("deepHashCode: " + Arrays.deepHashCode(ar2)); // 3230
        System.out.println(Arrays.hashCode(ar2)); // -63311286

        // Arrays.equal(array1, array2)
        System.out.println("equals: " + Arrays.equals(ar, ar1));
        // Arrays.fill(array, value)
        Arrays.fill(ar1, 0);
        System.out.println("fill: " + Arrays.toString(ar1));

        // Arrays.hashCode(array)
        System.out.println("hashCode: " + Arrays.hashCode(ar));
        // Arrays.mismatch(array1, array2)
        System.out.println("mismatch: " + Arrays.mismatch(ar, ar1));
        // Arrays.spliterator(array)
        Spliterator.OfInt arrSpliterator = Arrays.spliterator(ar);
        System.out.println("spliterator: " + arrSpliterator);

        // Arrays.sort(array)
        Arrays.sort(ar);
        System.out.println("sorted array: " + Arrays.toString(ar));

        // Arrays.stream(array)
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

