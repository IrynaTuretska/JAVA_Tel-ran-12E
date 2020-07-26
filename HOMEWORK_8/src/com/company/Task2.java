package com.company;

public class Task2 {

    public static void main(String[] args) {
        // write your code here

        System.out.println(returnResult( 30, 90));
    }

    public static double returnResult(int a, int b) {
        if (a-b > (a-b)*100/a) {
            return  (b + (b*0.03));

        } else {
            return a;

        }
    }
}
