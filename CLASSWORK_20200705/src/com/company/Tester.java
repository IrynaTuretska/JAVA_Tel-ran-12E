package com.company;


public class Tester extends Employee {

    public Tester(String name, double salary) {
        super(name, salary ); // ссылка на родительский object (this не надо)
    }

    public void work() {
        System.out.println("tester: I am testing code");
    }


    @Override
    public String toString() {
        return "Tester + name" +super.getName()+ "(" + super.getSalary() + ")";
    }


}
