package com.company;

// main {  [][a=10][b=20][v=10][][]   }
//              x100
// minus 1 {[][a=  1000 ][b=20 ][][][]
//          x500


public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int v = 4;
        minus(v,a);
        minus(a,b);
        System.out.println(a);
        String s=multiply(10,5);
        System.out.println("multiply return is " +s);
        multiply(-10,5);
        minus(5,18);
        div(18,3);
        div(20,3);
        div(20.0,3.0);
        div(28.0,3);
    }
    public static String multiply(int a, int b){
        System.out.println("a*b="  + a*b);
        return "hello rez:" + a*b;
    }

    public static void minus(int a, int b){
        //a=1000;
        int rez;
        rez= a-b;
        //System.out.println("a-b="  + rez);
        System.out.println(a+"-"+b+"="  + (a-b));
    }

    public static void div(int a, int b){
        System.out.println(a+"/"+b+"=" + (a/b));
    }

    public static void div(double a, double b){
        System.out.println(a+"/"+b+"=" + (a/b));
    }

    public static void div(double a, int b){
        System.out.println("-----");
        System.out.println(a+"/"+b+"=" + (a/b));
    }
}
