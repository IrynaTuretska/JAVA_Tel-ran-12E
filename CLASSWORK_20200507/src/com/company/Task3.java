package com.company;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(getSumFromAtoB(1,3));
    }
    public static int getSumFromAtoB(int a,int b){
        /*
               a            b
               7 8 9 10 11 12

         */
        int i=  (a>b)?b:a;
        int sum=0;
        while (i<= ((a>b)?a:b) ){
            sum=sum + i;
            i++;
        }
        return sum;
    }
}
