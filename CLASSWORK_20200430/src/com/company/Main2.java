package com.company;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(getDayPerMonth(1,2000));
        System.out.println(getDayPerMonth(2,2000));
        System.out.println(getDayPerMonth(6,2000));
        System.out.println(getDayPerMonth(2,2001));

    }
    public static int getDayPerMonth(int month, int year){
        int rez=0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                rez=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                rez=30;
                break;
            case 2:
                if (isYearLeap(year)){
                    rez=29;
                } else {
                    rez=28;
                }
                break;
            default:
                rez=-1;
                break;
        }
// ? тринарный оператор

        return rez;
    }
    public static boolean isYearLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);
    }
}

