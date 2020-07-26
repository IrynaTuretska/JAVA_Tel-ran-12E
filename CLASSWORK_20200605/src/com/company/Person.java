package com.company;

public class Person {
    String name;
    int yearOfBirthday;


    public void print(){
        System.out.println(name + "["+getAge()+"]");
    }

    public int getAge(){
        return 2010-yearOfBirthday;
    }

}
