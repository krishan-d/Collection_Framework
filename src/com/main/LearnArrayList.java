package com.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        /*
        ArrayList<String> sName = new ArrayList();
        List<String> sName = new ArrayList();
        */

        List<String> sName = new LinkedList<>();
        // Automatic memory allocation
        // Internal Array

        sName.add("A");
        System.out.println(sName);
        // Internal array size 10 created

        // size n
        //     n + n/2 + 1   when needed

        List<Integer> iList = new ArrayList();
        iList.add(1);
        iList.add(2);
        iList.add(3);
        System.out.println(iList);

		/*
		List<Integer> sList = new ArrayList();
		sList.add(10);
		sList.add(20);
		System.out.println(sList);

		iList.remove(1);
		System.out.println(iList);

		iList.remove(Integer.valueOf(3));
		System.out.println(iList);

		System.out.println(iList.get(0));

		iList.addAll(sList);
		iList.set(0, 10);
		System.out.println(iList);

		iList.clear();
		System.out.println(iList);

		//Time complexity O(n) add/remove

		*/

		/*
		for (int i=0 ; i < iList.size() ; i++){
			System.out.println("For "+ iList.get(i));
		}

		for (Integer i : iList) {
			System.out.println("Foreach "+i);
		}

		Iterator<Integer> it = iList.iterator();
		while(it.hasNext()) {
			System.out.println("Iterator "+it.next());
		}
		*/
    }
}
