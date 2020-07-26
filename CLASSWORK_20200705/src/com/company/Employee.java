package com.company;

public abstract class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee + name" + name + "(" + salary + ")";
    }

    public void pay() {
        System.out.println("pay " + salary + " euro for " + name);
    }

    public void pay(int bonus) {
        System.out.println("pay " + (salary + bonus) + " euro for " + name);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void work();

}
