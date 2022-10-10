package com.learn.collection.collection_interface.list_interface;

import java.util.*;

public class ArrayListSorting {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, -1, 0, -2, 4);

        Collections.sort(list); //Comparable
        Collections.sort(list, Comparator.reverseOrder()); //Comparator

        Collections.reverse(list);


        List<Employee> empList = new ArrayList<>(Arrays.asList(
                new Employee("D", 1000),
                new Employee("E", 1001),
                new Employee("A", 1002)
        ));

        //Collections.sort(empList, new IdComparator());

        //Note: Lambda Expressions can be used to represent Functional interfaces.

        //Anonymous implementation of Comparator interface
        Collections.sort(empList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getId() - o2.getId();
            }
        });

        //Lambda Expression
        Collections.sort(empList, (o1, o2) -> o1.getId() - o2.getId());

        //Method referencing
        Collections.sort(empList, Comparator.comparingInt(Employee::getId));

        //Stream
        empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

    }

    static class IdComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
