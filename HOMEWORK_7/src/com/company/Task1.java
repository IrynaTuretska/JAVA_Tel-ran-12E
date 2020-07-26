package com.company;

public class Task1 {

    public static void main(String[] args) {
        /* 7_1. Написать метод, который принимает строку и в качестве результата
        возвращает строку, но в обратном порядке. Распечатать результат в main.
        Пример: “Hello” -> “olleH” */

        String input = "Hello ";
        printString(input);
        printString2(input);

    }

    public static void printString(String input) {

        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));

        }
    }

    public static void printString2(String input){

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }
}

