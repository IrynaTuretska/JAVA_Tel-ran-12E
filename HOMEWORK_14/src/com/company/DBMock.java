package com.company;

public class DBMock {

    private static Employee[] employees = {
            new CProgrammer("Jack1", 1000),
            new CProgrammer("Jack2", 2000),

            new JavaProgrammer("Nickolas1", 1000),
            new JavaProgrammer("Nickolas2", 2000),

            new JavaSkriptProgrammer("Viktor1", 1000),
            new JavaSkriptProgrammer("Viktor2", 2000),

            new Manager("Daniel1", 3000, 200),
            new Manager("Daniel2", 4000, 200)
    };

    public static Employee[] getEmployees(){
        return employees;
    }

    private static Employee[] programmers = {
            new CProgrammer("Jack1", 1000),
            new CProgrammer("Jack2", 2000),

            new JavaProgrammer("Nickolas1", 1000),
            new JavaProgrammer("Nickolas2", 2000),

            new JavaSkriptProgrammer("Viktor1", 1000),
            new JavaSkriptProgrammer("Viktor2", 2000),

    };

    public static Employee[] getProgrammers(){
        return programmers;

    }
    public void codeReview(Employee[] programmers){
        System.out.println("I'm " + getProgrammers() + ". This code is good.");;
    }

}
