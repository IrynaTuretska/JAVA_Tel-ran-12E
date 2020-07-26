package com.company;

public class Main {

    public static void main(String[] args) {

        String monthString = getStringMonth(3);
        System.out.println(monthString);

        System.out.println(checkDiv(10,2));
        System.out.println(checkDiv(10,3));
        System.out.println(checkDiv(10,0));
        System.out.println("----------------");
        System.out.println(checkDiv(10,-10));
        System.out.println("isLeap "+isLeap(2018));
        System.out.println("isLeap "+isLeap(1900));
        System.out.println("isLeap "+isLeap(2000));
        System.out.println("isLeap "+isLeap(2020));
    }

    public static boolean checkDiv(int a, int b){
        return (((b!=0)&&(a%b) ==0)  );
    }

    public static boolean isLeap(int year){
        // делится на 4
        // не делится на 100
        // делится на 400

        return (year%400==0) || ( (year%4==0) && (year%100!=0));
        //return (year%400==0) || (year%100!=0) && (year%4==0);
        //(year%400==0)&& (year%100!=0)

    }


    public static String getStringMonth(int month) {
        String monthString="";
        if (checkMonth(month)) {
            if (month == 1) {
                monthString = "январь";
            }
            if (month == 2) {
                monthString = "февраль";
            }
            if (month == 3) {
                monthString = "март";
            }
            //.......

        } else {
            monthString = "error";
        }
        return monthString;
    }


    public static boolean checkMonth(int month) {

//        if (month >= 1 && month < 13) {
//            return true;
//        } else {
//            return false;
//        }
//  то же, что выше, но короче:
        return (month >= 1 && month < 13);

    }

}
