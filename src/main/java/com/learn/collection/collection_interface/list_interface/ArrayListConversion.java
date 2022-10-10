package com.learn.collection.collection_interface.list_interface;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConversion {

    public static void main(String[] args) {

        //Array To ArrayList:
        String[] arr = {"Hi", "There", "!"};
        //List<String> arrayToArrayList = new ArrayList<>(Arrays.asList(arr)); //CTE
        ArrayList<String> arrayToArrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Array To ArrayList: " + arrayToArrayList);

        //ArrayList To String
        String arrayListToString = arrayToArrayList.toString();
        System.out.println("ArrayList To String: " + arrayListToString);

        //ArrayList To Array
        String[] arrayListToArray = arrayToArrayList.toArray(new String[0]);
        System.out.println("To Array: " + Arrays.toString(arrayListToArray));
        for (String s : arrayListToArray)
            System.out.print(s + " ");
    }
}
