package com.learn.collection.collections_class;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person s1, Person s2) {
        return s1.name.compareTo(s2.name);
    }
}
