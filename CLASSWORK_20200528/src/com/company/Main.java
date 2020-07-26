package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum(1000));
    }

    public static double sum(int n){
        double res=0.0,pow=1;
        for (int i=1; i<=n;i++){
            pow=pow*2;
            double j= 1.0/pow;
            res=res+j;

        }
        return res;
    }

}
/*
                n
 1 2 3 4 5 6 7..n

    1/2  1/4  1/8  1/16 ...... 1/2^n

   3  7   11   15 ......

 */