package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getResult(9,100)); //39
        System.out.println(getResult(10,30)); //20

    }

    public static int getResult(int a, int b){
        int res;
        if(isCondition(a)&&isCondition(b)){
            res = a+b;
        } else {
            int min= (a>b)?b:a;
            int max= (a>b)?a:b;
            res= max-min;
        }
        return res;
    }

    public static boolean isCondition(int x){
        return (x %3==0)&&(x >0)&&(x <100);
    }

}
// (condition)?  7+a+b: 7-a-b;