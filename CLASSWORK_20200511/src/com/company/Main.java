package com.company;

public class Main {

    public static void main(String[] args) {

        // Class - Object

        Person person1 = new Person(); //create an object of the Person class
        person1.name = "Nick";
        person1.age =30;

        Person person2 = new Person();
        person2.name = "Jack";
        person2.age =20;

        Date date1=new Date(); //create an object of the Person class
        date1.day=10;
        date1.month=1;
        date1.year=2020;

        date1.print();
        System.out.println(date1.isYearLeap());

        person1.print();
        person2.print();

        // String is a class too
        String s="hello!";
        String s1 = new String("hello2rrr1");
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());

    }
}