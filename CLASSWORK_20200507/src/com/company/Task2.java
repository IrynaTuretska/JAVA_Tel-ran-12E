package com.company;

public class Task2 {

    public static void main(String[] args) {
        whileDemo(2,"hello");
        doWhileDemo(2,"hello");
        forDemo(2,"hello");

    }

    public static void whileDemo(int n, String string){
        System.out.println("while demo start");
        int i=0;
        while (i<n){
            System.out.println(i+") "+string);
            i++;
        }
        System.out.println(i);
        System.out.println("while demo finish");
    }

    public static void doWhileDemo(int n, String string){
        System.out.println("doWhile demo start");
        int i=0;
        do{
            System.out.println(i+") "+string);
            i++;
        }while (i<n);
        System.out.println(i);
        System.out.println("doWhile demo finish");
    }

    public static void forDemo(int n, String string){
        System.out.println("for demo start");
        int i=0;
        for (i=0; i<n;i++) {
            System.out.println(i+") "+string);
        }
        System.out.println(i);
        System.out.println("for demo finish");
    }

}

