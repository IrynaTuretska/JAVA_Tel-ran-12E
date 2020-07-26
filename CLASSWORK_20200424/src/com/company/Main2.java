package com.company;

public class Main2 {

    public static void main(String[] args) {
        System.out.println(" Kino " + isBigger18(10));
    }

    public static boolean isBigger18(int age) {
        boolean bool = age > 18;

        if (bool) {
            //System.out.println(age+ "is bigger than 18");
            return true;
        } else {
            //System.out.println(age+ "is smaller bigger than 18");
            return false;
        }
    }
}