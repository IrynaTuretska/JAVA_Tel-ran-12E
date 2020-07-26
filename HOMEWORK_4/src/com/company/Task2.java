package com.company;


public class Task2 {

    public static void main(String[] args) {
        // 5.2 Multiplication Table (3)

        printMultiplicationTable(10);
    }

    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            int j=3;
            System.out.println(j + " x " + i +" = " + j * i);
        }
        System.out.println(" ");
    }

}
