package com.company;

public class Main {

    public static void main(String[] args) {

     Canon5400 p1 = new Canon5400();
     Canon5400 p2 = new Canon5400();
     Canon5400 p3 = new Canon5400();

     Xerox8211 p4 = new Xerox8211();


     printString("hello interface", p1);
     printString("hello interface", p4);
    }

    public static void printString(String s, Printer p){
        p.print(s);
    }
}
