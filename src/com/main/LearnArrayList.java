package com.main;

import java.util.*;

public class LearnArrayList {
    public static void main(String[] args) {
        /*
        * ArrayList / Dynamic Array:
        * Implements List interface of collections framework.
        * */

        // Creating ArrayList:
        /*
        ArrayList<String> sName = new ArrayList<>();
        List<String> sName = new ArrayList<>(); // create ArrayList using List interface
        */

        List<String> sName = new LinkedList<>();
        /*
        * Automatic memory allocation
        * Internal array of size 10 created
        * size n
        *     n + n/2 + 1   when needed
        * */
        sName.add("Eve");
        sName.add("Edwina");
        sName.add("Edward");
        System.out.println("ArrayList: " + sName);


        // Basic operations:
        ArrayList<Integer> iList = new ArrayList<>();
        // Addition
        iList.add(1);
        iList.add(2);
        iList.add(3);
        System.out.println("Integer ArrayList: " + iList);

        iList.add(0, -1);  // Add at specified position

        // Add every element of a set to an ArrayList
        HashSet<String> chars = new HashSet<>();
        chars.add("a");
        chars.add("e");
        chars.add("i");
        List<String> sArray = new ArrayList<>();
        sArray.add("o");

        sArray.addAll(chars);
        System.out.println("ArrayList: " + sArray);

        // Accessing items
        int item = iList.get(0);  // return item at Index given

        // Change ArrayList items
        iList.set(0, 10);

        // Remove ArrayList items
        int removed = iList.remove(1);
        System.out.println("\nRemoved item: " + removed + " Updated ArrayList: " + iList);

        iList.remove(Integer.valueOf(3));
		// iList.clear();

        /*
        * Other Methods:
        * size() : return size of arrayList
        * sort() : sort arrayList
        * clone() : create new arrayList with same items, size and capacity
        * contains() : searches arrayList for specified item and return boolean result
        * ensureCapacity() : specifies total items the arrayList can contain
        * isEmpty()
        * indexOf() : search item in arrayList and return index of item
        * */


        // Iteration:
		/*
		for (int i=0 ; i < iList.size() ; i++){
			System.out.println("For "+ iList.get(i));
		}

		for (Integer i : iList) {
			System.out.println("Foreach " + i);
		}

		Iterator<Integer> iterate = iList.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next() + " ");
		}
		*/

        // Array To ArrayList:
        String[] arr = {"Hi", "There", "!"};
        ArrayList<String> arrayToArrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("ArrayList: " + arrayToArrayList);
        // ArrayList To String
        String arrayListToString = arrayToArrayList.toString();
        System.out.println("String: " + arrayListToString);
        // ArrayList To Array
        String[] arrayListToArray = arrayToArrayList.toArray(new String[0]);
        for (String s : arrayListToArray)
            System.out.print(s + " ");
    }
}
