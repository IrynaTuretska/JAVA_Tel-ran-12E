package com.company;

public class Main9 {

// Задача № 9: Модуль числа (abs).


    public static void main(String[] args) {
        System.out.println(abs(5));
        System.out.println(abs(-5));

    }
    public static int abs(int a) {
        if (a<0) {
            return a*(-1);
        } else {
            return a*1;
        }
    }
}