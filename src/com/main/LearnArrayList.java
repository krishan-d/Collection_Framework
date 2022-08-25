package com.main;

import java.util.*;

public class LearnArrayList {
    public static void main(String[] args) {
        /*
         * ArrayList:
         * Implements List interface
         * Stores a single value
         * Internally uses dynamic/resizing array to store elements
         * Slow manipulation operations such as remove because of internal array
         * Better for storing and accessing elements
         *
         * LinkedList:
         * Implements List, Queue, and Deque interfaces.
         * Stores data, previous and next address
         * Internally uses doubly-linked list
         * Faster manipulation operations
         * Better for manipulating elements
         * */

        // Creating ArrayList:
        ArrayList<String> arrayList = new ArrayList<>();
        List<String> sName = new ArrayList<>(); // create ArrayList using List interface


        LinkedList<String> sLL = new LinkedList<>(); //LinkedList
        List<String> arrayLinkedList = new LinkedList<>();  // LinkedList
        arrayLinkedList.add("Eve");
        arrayLinkedList.add("Edwina");
        arrayLinkedList.add("Edward");
        System.out.println("LinkedList: " + arrayLinkedList + " size: " + arrayLinkedList.size());

        /*
         * Automatic memory allocation
         * Internal array of size 10 created
         * size n
         *     n + n/2 + 1   when needed
         * */

        // ArrayList methods:
        ArrayList<Integer> iList = new ArrayList<>();
        iList.add(1);
        iList.add(2);
        iList.add(3);
        iList.add(0, -1);  // Add at specified position
        System.out.println("Integer ArrayList: " + iList);

        List<String> sArrayList = new ArrayList<>();
        sArrayList.add("o");
        sArrayList.add("i");

        // addAll():
        // Add every element of a set to an ArrayList
        HashSet<String> chars = new HashSet<>();
        chars.add("a");
        chars.add("e");

        sArrayList.addAll(chars);
        System.out.println("ArrayList: " + sArrayList);

        //removeAll():
        ArrayList<String> sToRemove = new ArrayList<>();
        sToRemove.add("a");
        sToRemove.add("u");
        sArrayList.removeAll(sToRemove);
        System.out.println("ArrayList: " + sArrayList);

        //retainAll():
        ArrayList<String> sToRetain = new ArrayList<>();
        sToRemove.add("o");
        sToRemove.add("z");
        sArrayList.retainAll(sToRetain);
        System.out.println("ArrayList: " + sArrayList);

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
        System.out.println("Integer ArrayList: " + iList + " | Size: " + iList.size());
		for (int i=0 ; i < iList.size() ; i++){
			System.out.println("For "+ iList.get(i));
		}

		for (Integer i : iList) {
			System.out.println("Foreach " + i);
		}
        //Forward Iteration
		Iterator<Integer> iterate = iList.iterator();
		while (iterate.hasNext()) {
			System.out.print(iterate.next() + " ");
		}
        System.out.println();

        ListIterator<Integer> itr = iList.listIterator();
        while (itr.hasNext()) {
            System.out.println("next: " + itr.next());
        }
        //Backward Iteration
        while (itr.hasPrevious()) {
            System.out.println("previous: " + itr.previous());
        }

        //Conversion:
        //Array To ArrayList:
        String[] arr = {"Hi", "There", "!"};
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
        System.out.println();


        Emp e1 = new Emp("A", 1000);
        Emp e2 = new Emp("B", 1001);
        Emp e3 = new Emp("C", 1002);

        List<Emp> empList = new ArrayList<>(Arrays.asList(e1, e2, e3));
        System.out.println(empList);

        for (Emp e : empList)
            System.out.println(e.toString());


    }
}

class Emp{
    String name;
    int id;

    public Emp(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
