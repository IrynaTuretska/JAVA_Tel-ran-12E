package com.company;

public class Main {

    public static void main(String[] args) {
        int month = 11;
        System.out.println(" Month - " + checkMonth(month));
        System.out.println(" The number " + month + " is Month of - " + getStringMonth(month));
    }

    // Задача №1: checkMonth 01 method

    public static boolean checkMonth(int month) {
        boolean rez = month >= 1 && month < 13;

        if (rez) {
            return true;
        } else {
            return false;
        }
    }

    //---------------------------------------------------

    // Задача №2: getStringMonth используя код задачи №1.

    public static String getStringMonth(int month) {

        if (month == 1) {
            return "January";
        }
        if (month == 2) {
            return "February";
        }
        if (month == 3) {
            return "March";
        }
        if (month == 4) {
            return "April";
        }
        if (month == 5) {
            return "May";
        }
        if (month == 6) {
            return "June";

        }
        if (month == 7) {
            return "July";
        }
        if (month == 8) {
            return "August";
        }
        if (month == 9) {
            return "September";
        }
        if (month == 10) {
            return "October";
        }
        if (month == 11) {
            return "November";
        }
        if (month == 12) {
            return "December";
        } else {
            return "Error";
        }
    }
}
