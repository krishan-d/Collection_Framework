package com.learn.collection.collection_interface.collection;

public class CollectionNeed {
    public static void main(String[] args) {
        String dm = "Edwina, Eve";
		String[] sArray = dm.split(",");
		for (String s : sArray) System.out.println(s);


		int a = 1;
		int b = 2;
		int c = 3;
		int d = 3;
		int e = 3;

		int[] intArray = new int[1000];

		//Array Limitations:
		//1. Fixed sized
		//2. Holds only homogeneous data elements
        //3. Ready-made APIs support is not available in Array

		Book[] books = new Book[10];
        books[0] = new Book();
		//books[1] = new Test(); //Compile Time Error

		Object[] objects = new Object[100];
		objects[0] = new Test();
		objects[1] = new Book();
		objects[2] = new Book();

        //Note: Overcome to the Limitations of Array we need Collection Framework

    }
}

class Book {

}

class Test {

}
