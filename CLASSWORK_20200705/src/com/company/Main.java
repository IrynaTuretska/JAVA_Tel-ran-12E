package com.company;


public class Main {
    public static void main(String[] args) {
        EmployeeArray dep01 = new EmployeeArray(DBMock.getEmployees());

        EmployeeArray dep02 = new EmployeeArray(
                new Employee[]{
                        new Manager("Sasha", 2000, 100),
                        new CProgrammer("Oleg", 3000)
                }
        );
        System.out.println("-------- department 01");
        dep01.PrintAll();
        System.out.println("-------- department 02");
        dep02.PrintAll();
        EmployeeArray[] firm = {dep01, dep02};
        for (EmployeeArray arr : firm) {
            arr.workAll();
        }


    }
}
