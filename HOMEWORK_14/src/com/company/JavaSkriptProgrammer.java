package com.company;

public class JavaSkriptProgrammer extends Employee{

    public JavaSkriptProgrammer(String name, double salary){
        super(name, salary);
    }

    public void work(Employee employee){
        System.out.println(employee.toString());

    }
    public void codeReview(){
        System.out.println(getName() + " - This Java code is good.");
    }
}

