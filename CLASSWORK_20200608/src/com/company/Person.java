package com.company;

public class Person {
    String name;
    int yearOfBirthday;
    int weight;
    Car car;

    // HAS A

    public Person(String name, int yearOfBirthday){
        this.name=name;
        this.yearOfBirthday=yearOfBirthday;
    }

    public Person(String name, int yearOfBirthday, int weight){
        this.name=name;
        this.yearOfBirthday=yearOfBirthday;
        this.weight=weight;
    }

    public void print(){
        System.out.println(name + "["+getAge()+"]" + ((weight!=0)?weight:""));
        if(car!=null){
            System.out.println("    has a car "+car.toString());
        }
    }

    public int getAge(){
        return 2020-this.yearOfBirthday;
    }

}
