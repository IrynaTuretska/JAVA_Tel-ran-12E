package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	     b= (condition) ? b+1 (true) : b*10 (false);
	     ()?  :    ;
	 */
        System.out.println(rnd(4.567));
        System.out.println(rnd2(4.567));
        System.out.println(rnd(4.2));
        System.out.println(rnd2(4.2));

    }
    public static boolean checkAbs(int a){
        return abs(a)<20;
    }
    public static int rnd(double num){
        int c = (int)num;
        return c;
    }

    public static int rnd2(double num){
        int c = (int)num;
        double  rest = num-c;
        return (rest>=0.5)? ++c :c;

    }


    public static int abs(int a){
        if(a<0){
            return -1*a;
        } else {
            return a;
        }
    }

    public static int abs2(int a){
        return  (a<0)? -1*a : a;
    }
/*
4.567
4
4.0
 */

}