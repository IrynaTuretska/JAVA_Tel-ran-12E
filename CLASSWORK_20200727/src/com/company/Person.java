package com.company;

public class Person {
    public String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name: " + name + '\'';
    }

    public Person(String name) {
        this.name = name;
    }
}
