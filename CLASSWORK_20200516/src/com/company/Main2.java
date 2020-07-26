package com.company;

public class Main2 {

    // boolean
    public static void main(String[] args) {
        //&& - логическое И   || - логическое ИЛИ    ! - логическое НЕ
        int a=10;
        int b=40;
        int c=30;

        boolean bool =true; // false
        boolean bool1= c>a;
        boolean bool2= c>b;
        System.out.println("----------- && (AND) ------------");
        //bool =  (c>a) && (c>b)  && (c>=c);
        bool =  (c>a) && (c>b);
        System.out.println("bool1="+ bool1);
        System.out.println("bool2="+bool2);
        System.out.println("bool1&&bool2="+bool);

        System.out.println("----------- || (OR) ------------");
        bool =(c>a)||(c>b);
        //System.out.println(bool);

        bool1= c>a;
        bool2= c>b;
        bool = bool1||bool2;
        System.out.println("bool1="+ bool1);
        System.out.println("bool2="+bool2);
        System.out.println("bool1||bool2="+bool);

        System.out.println("----------- ! (NOT) ------------");

        boolean bool3=true;
        boolean bool4= !bool3;
        System.out.println("bool3="+bool3);
        System.out.println("!bool3="+ bool4);

    }
}