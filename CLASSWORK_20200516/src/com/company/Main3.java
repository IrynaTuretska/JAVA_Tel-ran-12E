package com.company;

public class Main3 {

    public static void main(String[] args) {
        int a1=3;
        int b1=4;
        int a2=7;
        int b2=5;
        int s1= a1*b1;
        int s2= a2*b2;
        boolean rez = s1>s2;

        System.out.println("a1="+a1 + " b1="+b1 + " s1= "+s1);
        System.out.println("a2="+a2 + " b2="+b2 + " s2= "+s2);
        System.out.println("Первый больше второго -"+rez);

        System.out.println("----- use method -----");
        s1=getArea(a1,b1);
        s2=getArea(a2,b2);
        printRectangle(a1,b1);
        printRectangle(a2,b2);
        System.out.println("Первый больше второго -"+isFirstBigger(s1,s2) );

    }

    public static int getArea(int a,int b){
        int s= a*b;
        return s;
    }

    public static boolean isFirstBigger(int s1,int s2){
        return s1>s2;
    }

    public static void printRectangle(int a, int b){
        System.out.println("rectangle: a="+a + " b="+b + " s= "+getArea(a,b));
    }

}
