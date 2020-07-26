package com.company;


public class Task1 {

    public static void main(String[] args) {
        // write your code here
        printMultiplicationTable(10);
    }

    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(j * i + "  ");
            }
            System.out.println(" ");
        }

    }
}
