package com.company;

public class Main {

    public static void main(String[] args) {
        // Задача № 2_1. (switch case) Дни Недели.

        int day = 4;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thurthday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Unknown Day");
        }
    }
}
