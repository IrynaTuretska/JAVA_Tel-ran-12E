package com.company;

public class Task3 {

    public static void main(String[] args) {
        //3_3. * Дано целое трехзначное число. Написать метод,
        //который определит четность/ нечетность разрядов этого числа.

        System.out.println(check1(814));
        System.out.println(check2(814));
        System.out.println(check3(814));

    }
    public static boolean hundreds(int number) {//hundreds
        return ((number) / 100 % 2 == 0);
    }

    public static String check1(int number) {
        String rez = "";
        if (hundreds(number)) {
            rez = ("Номер 1 (сотни) - четнoе число");
        } else {
            rez = ("Номер 1 (сотни) - нечетнoе число");
        }
        return rez;
    }
    public static boolean tens(int number) {//tens
        return (number - ((((number) / 100) * 100) / 10) - ((number) / 10) % 2) % 2 == 0;
    }
    public static String check2(int number) {
        String rez = "";
        if (tens(number)) {
            rez = ("Номер 2 (десятки) - четнoе число");
        } else {
            rez = ("Номер 2 (десятки) - нечетнoе число");
        }
        return rez;
    }
    public static boolean ones(int number) {//ones
        return ((number) % 10) % 2 == 0;
    }
    public static String check3(int number) {
        String rez = "";
        if (ones(number)) {
            rez = ("Номер 3 (еденицы) - четнoе число");
        } else {
            rez = ("Номер 3 (еденицы) - нечетнoе число");
        }
        return rez;
    }
}