package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b =67;
        boolean rez=isMaxThan100(b);

        System.out.println(rez);
        boolean bool= true; // false;
        int resOfmax=max(a-10,a+100);
        System.out.println(resOfmax);

        // write your code here
    }
    public static int max(int a, int b){
        int rez;
        boolean bool = a>b;
        //if (condition) {} else {}
        if (bool){
            rez=a;
        } else {
            rez=b;
        }
        return rez;
    }


    public static boolean isMaxThan100(int a){
        boolean bool = a>100;
        /*
        if(bool){
            System.out.println(a+ "is bigger than 100");
            return true;
        }else{
            System.out.println(a+ "is smaller bigger than 100");
            return false;

         */
        return bool;
    }


}
