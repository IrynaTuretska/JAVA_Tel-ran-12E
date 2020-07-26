package com.company;

public class Main {

    public static void main(String[] args) {

        countdown();

    }

    // 3_6
    public static void countdown(){
        int a=5;
        while (a>0){
            System.out.println(getNumByText(a));
            a--;
        }
        System.out.println("start");
    }
    public static String getNumByText(int num){
        switch (num){
            case 1: return "one";
            case 2: return "two";
            case 3: return "tree";
            case 4: return "four";
            case 5: return "five";
            default: return "error";
        }
    }
}
