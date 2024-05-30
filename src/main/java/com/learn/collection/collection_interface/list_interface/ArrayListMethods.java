package com.learn.collection.collection_interface.list_interface;

import java.util.*;

public class ArrayListMethods {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        //isEmpty()
        if (arrayList.isEmpty()) System.out.println("ArrayList is Empty!");

        arrayList.add("E1");
        arrayList.add(null);
        arrayList.add("E2");
        arrayList.add("E2");
        arrayList.add("E3");
        arrayList.add(0, "E0");

        System.out.println("ArrayList: " + arrayList + " size: " + arrayList.size());

        //ArrayList methods:
        //removeAll():
        ArrayList<String> sToRemove = new ArrayList<>(Arrays.asList("E3", "E4"));
        arrayList.removeAll(sToRemove);
        System.out.println("ArrayList: " + arrayList);

        //retainAll():
        ArrayList<String> sToRetain = new ArrayList<>(Arrays.asList("E0", "E2", "E3"));
        arrayList.retainAll(sToRetain);
        System.out.println("ArrayList post retain: " + arrayList);

        //get()
        String item = arrayList.get(0);  // return item at Index given
        System.out.println("arrayList.get(0): " + item);

        //set()
        arrayList.set(1, "E1");
        System.out.println("ArrayList: " + arrayList);

        //remove()
        String removed = String.valueOf(arrayList.remove("E7")); //E7 ELEMENT NOT EXIST IN LIST
        System.out.println("\nRemoved: " + removed + " Updated ArrayList: " + arrayList);

        arrayList.remove("ELEMENT_NOT_EXIST");
        arrayList.remove("E2");

        System.out.println("ArrayList: " + arrayList);

        //removeIf(Predicate)
        arrayList.add(null);
        arrayList.add("NOT NULL");
        arrayList.removeIf(Objects::isNull);
        System.out.println("ArrayList: " + arrayList);

        // ArrayList.sort()
        arrayList.sort(Comparator.reverseOrder());
        System.out.println("ArrayList sorted: " + arrayList); // [NOT NULL, E1, E0]

        //ArrayList.clear()
        arrayList.clear();
        System.out.println("ArrayList: " + arrayList);

        /*
        * Other Methods:
        * sort() : sort arrayList
        * clone() : create new arrayList with same items, size and capacity
        * contains() : searches arrayList for specified item and return boolean result
        * ensureCapacity() : specifies total items the arrayList can contain
        * isEmpty()
        * indexOf() : search item in arrayList and return index of item
        * */

    }
}
