package com.company;


public class Main {

    public static void main(String[] args) {
        Plant[] plants = {
                new Tree("Apple tree", 150),
                new Bush("Jasmin", 40),
                new Flower("Lilly", 0)};

        for (Plant element : plants) {
            element.year();
            element.year();
        }
    }
}
