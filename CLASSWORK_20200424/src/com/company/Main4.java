package com.company;

public class Main4 {

    public static void main(String[] args) {
        int day;
        int month;
        int year;
        printDate(4,5,2020,"-");
        printDate(14,5,2020,"-");
        printDate(14,11,2020,"-");
        printDate(4,11,2020,"-");

    }
    public static void printDate
            ( int day, int month, int year, String delimiter){
        String rez="";
        if (day<10){
            rez="0"+day;
        } else{
            rez=rez+day;
        }
        rez=rez+delimiter;
        if (month<10){
            rez=rez+"0"+month;
        } else {
            rez=rez+month;
        }
        rez=rez+delimiter +year;

        System.out.println(rez);
    }

}
