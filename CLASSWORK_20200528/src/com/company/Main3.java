package com.company;

public class Main3 {

    public static void main(String[] args) {

        sumOfN(3);

    }

    /*Написать метод, который считает сумму n первых членов следующего ряда 1/2+ 1/4+1/8+.... +1/2 .*/
    public static void sumOfN (int n){
        double res=1;
        double a=0.5;
        double sum=0;
        for (int i=1;i<=n; i++ ) {
            res=res*a;
            sum=sum+res;

        }
        System.out.println("Cумма первых членов ряда 1/2+ 1/4+ 1/8+.... +1/2^n при n="+n+":"+" "+sum);
    }
}
