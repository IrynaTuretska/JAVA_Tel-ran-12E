package com.company;

public class CProgrammer extends Employee{

    public CProgrammer(String name, double salary){
        super(name, salary);
    }

    public void work(Employee employee) {
        System.out.println(employee.toString());

    }

    public void codeReview(){
        System.out.println(getName() + " - This code is good");
    }

}
