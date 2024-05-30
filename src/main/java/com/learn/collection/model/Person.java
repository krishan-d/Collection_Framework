package com.learn.collection.model;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person p = (Person) obj;
        return id == p.id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Person that) {  //To be used by Collections.sort
        return this.id - that.id;
        // OR
        // return this.name.compareTo(that.name);
        // To avoid this situation use Comparator.
    }
}
