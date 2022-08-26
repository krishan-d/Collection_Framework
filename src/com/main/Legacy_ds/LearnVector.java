package com.main.Legacy_ds;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class LearnVector {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();//creating vector

        v.add("A");  //method of Collection
        v.addElement("I");  //method of Vector
        v.addElement("E");

        System.out.println("USING ENUMERATION TO ITERATE:");
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        System.out.println("USING ITERATOR TO ITERATE:");
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
