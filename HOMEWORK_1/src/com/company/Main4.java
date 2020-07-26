package com.company;

public class Main4 {

    public static void main(String[] args) {
        // Задача №5: dateValidate

        System.out.print(dateValidate(1, 5, 2020));
    }

    public static boolean dateValidate(int day, int month, int year) {
        boolean statmentCorrect = ((((((day >=1 && day <= 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) && (year >= 0001)) ||
                ((day >=1 && day <= 30) && (month == 4 || month == 6 || month == 9 || month == 11) && (year >= 0001))) ||
                (((day >= 28) && (month == 2) && ((year >= 0001)))) &&
                        ((day == 29) && (month == 2) && ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)))));


        if (statmentCorrect){
            return true;
        }else{
            return false;
        }

    }

}