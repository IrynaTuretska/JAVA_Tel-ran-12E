package com.company;

public class Main2 {

    public static void main(String[] args) {
        System.out.println(getStringMonth(1));
    }

    public static String getStringMonth(int month) {
        String rez = "error";
        if (month == 1) {
            return "january";
        }
        if (month == 2) {
            return "february";
        }
        return rez;
    }
}


