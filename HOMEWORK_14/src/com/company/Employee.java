package com.company;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }

    public void pay(){
        System.out.println(getName() + " is being paid  " + salary + " EUR.");
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;

    }

    public void work() {
        System.out.println("I'm " + getName() + ". I work as a programmer. I write a program.");


    }
    public void codeReview(Employee[] programmers){
        System.out.println("I'm " + getName() + ". This code is good.");;
    }

}