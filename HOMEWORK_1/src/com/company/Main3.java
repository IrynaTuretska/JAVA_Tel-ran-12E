package com.company;

public class Main3 {

    public static void main(String[] args) {
        // Задача №4: isLeapYear
        System.out.println("Этот год является високосным - " + isLeapYear(2020));
    }
    public static boolean isLeapYear(int year){

        return ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0));

    }
}
