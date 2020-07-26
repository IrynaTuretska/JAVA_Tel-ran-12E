package com.company;

public class Main10 {

    public static void main(String[] args) {

        // Задача №11: true или false если один из 2ч аргументов = 10 или их сумма = 10

        System.out.print(summCheck(8, 2));
    }

    public static boolean summCheck(int a, int b) {

        boolean result = (a == 10 || b == 10) || ((a + b) == 10);
        if (result) {
            return true;
        } else {
            return false;
        }
    }
}