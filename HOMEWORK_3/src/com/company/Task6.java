package com.company;

public class Task6 {

    public static void main(String[] args) {
    /* 3_6.    * реализовать метод “ Обратный отсчёт ” который выводит на экран
    цифры от 5 до 1 текстом, затем выводит строку „start“.*/

        int a = 5;
        while (a >= 1) {
            System.out.println("Five");
            a = a-5;
            System.out.println("Four");
            a = a-4;
            System.out.println("Three");
            a = a-3;
            System.out.println("Two");
            a = a-2;
            System.out.println("One");
            a = a-1;

        }
        if ((a <= 1)) ;
        System.out.println("Start");

    }
}