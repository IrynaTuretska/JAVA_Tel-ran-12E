package com.company;

public class Main2 {

    public static void main(String[] args) {
     /*
        int day;
        int month;
        int year;

        day = 4;
        month = 11;
        year = 2020;

    */

        printDate(4,5,2020);
        printDate(24,5,2020);
        printDate(20,6,2020,"-");

        /*
        if (condition){
            true
        } else {
            false
        }
         */

        /*
        ==  равно
        !=  не равно
        >
        <
        >=
        <=
      (  ()&() )
      (  ()||() )

         */
        //  ((day>0) & (day<31))

        if(3!=7){
            System.out.println("hello");
        } else {
            System.out.println("bay");
        }

    }

    public static void  printDate( int day,int month,int year){
        if(day>9) {
            System.out.println(day + "/" + month + "/" + year);
        } else {
            System.out.println("0"+ day + "/" + month + "/" + year);
        }
    }

    public static void  printDate( int day,int month,int year,
                                   String delimiter){
        System.out.println(day+delimiter+month+delimiter+year);
    }
}
