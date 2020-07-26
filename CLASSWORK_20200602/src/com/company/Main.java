package com.company;

public class Main {

    public static void main(String[] args) {
        int age=10;
        System.out.println("1: in main "+ age);
        method(age);
        System.out.println("2: in main "+ age);
        System.out.println("------------------------------------");
        int[] arr={10};
        System.out.println("1: in main "+ arr[0]);
        method1(arr);

        System.out.println("2: in main "+ arr[0]);

        int[] arr2={100,87,87,300,65};
        System.out.println(arr2);
        String s= arrToString(arr2);
        System.out.println(s);
    }

    public static String arrToString(int[] array){
        String str="";
        for (int i=0;i<array.length;i++){   // "100  87  87  300  65"
            str+=array[i] +"  ";
        }
        return str;
    }

    public static void print(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void method(int age){
        age=age+1;
        System.out.println("age in method "+age);
    }

    public static void method1(int[] age){
        age[0]=age[0]+1;
        System.out.println("age in method "+age[0]);
    }
}

/*
               age         arr                      начало данных
main:       [][10][][][] [ начало данных ][][]       [10][11][12][]

               age
method      [][11][][][][][][][]

               age
method1     [][0x100 ][][][][][]
                                    arr2
[]][][][100][87][87][300][65][][][]][0x234  length=5]
        0x234

 */
