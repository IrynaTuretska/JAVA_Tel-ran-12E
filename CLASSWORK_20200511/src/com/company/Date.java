package com.company;

public class Date {
    int day;
    int month;
    int year;

    public void print(){
        System.out.println(day+"-"+month+"-"+year);
    }

    public boolean isYearLeap(){
        return (year%400==0)||(year%4==0&&year!=100);
    }
}
