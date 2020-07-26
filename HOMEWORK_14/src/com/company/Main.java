package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = DBMock.getEmployees();
        Employee[] programmers = DBMock.getProgrammers();


        for (Employee employee : employees) {
            employee.work();
        }
        System.out.println("------------------------------------------------------------------------");

        for (Employee employee : programmers) {
            employee.codeReview(programmers);
        }
        System.out.println("------------------------------------------------------------------------");

        for (Employee employee: employees) {
            employee.pay();
        }
        System.out.println("------------------------------------------------------------------------");

        for (Employee employee: employees){
            employee.pay();
        }
    }
}