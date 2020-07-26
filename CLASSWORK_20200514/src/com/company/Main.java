package com.company;

public class Main {

    public static void main(String[] args) {
        int n=30, i=0;
        int counter=0;
        System.out.println("-------- for -------------");
        for (i=0; i<=n; i++){
            if(i%3==0&&i%5==0) {
                print(i);
                counter++;
            }
        }
        System.out.println("after for "+i);//31
        System.out.println("the print counter   "+counter);
        System.out.println("-------- while -------------");
        i=0;
        counter=0;
        while (i<=n){
            if(i%3==0&&i%5==0) {
                print(i);
                counter++;
            }
            i++;
        }
        System.out.println("after while "+i);//31
        System.out.println("the print counter   "+counter);

        System.out.println("-------- do while -----------");
        i=0;
        counter=0;
        do{
            if(i%3==0&&i%5==0) {
                print(i);
                counter++;
            }
            i++;
        }while (i<=n);
        System.out.println("after do while "+i);//31
        System.out.println("the print counter   "+counter);
    }


    public static void print(int i){
        System.out.println(i);
    }

}
