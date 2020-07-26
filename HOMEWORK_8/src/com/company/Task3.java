package com.company;

public class Task3 {

    public static void main(String[] args) {

        System.out.println(getPrimeNumbers(10, 200));

    }
    public static String getPrimeNumbers(int a, int b) {
        String resString = "";
        int min = (a > b) ? b : a;
        int max = (a > b) ? a : b;


        for (int i = min; i <max; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= 1/2; j++) {
                if (i % j == 0) {
                    //for (int j = 2; j <= i / 2; j++) {
                    //if ((i % j) == 0) {
                    isPrime = false;

                }
            }
            if (isPrime) {
                resString = resString + i + " ";
            }
        }
        return resString;
    }
}
