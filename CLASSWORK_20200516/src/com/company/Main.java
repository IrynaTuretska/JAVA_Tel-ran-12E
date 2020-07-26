package com.company;

public class Main {

    public static void main(String[] args) {

        int getUserIndex= 10*105;  //объявили переменную getUserIndex и присвоили 1050
        int a=getUserIndex;        //объявили переменную a и присвоили ей значение getUserIndex
        System.out.println(getUserIndex); //1050
        getUserIndex= 60;                 // теперь в getUserIndex лежит 60, но в a осталось 1050
        int b;                            // объявили переменную b типа int
        b=getUserIndex;                   // присвоили переменной b значение getUserIndex т.е. 60
        System.out.println(getUserIndex); //60
        getUserIndex = 10*60;
        int c= getUserIndex;
        System.out.println("-----------------------------------------");
        System.out.println(getUserIndex);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        getUserIndex=getUserIndex+10; // присвоили getUserIndex значение которое было в getUserIndex увеличенное на 10
        System.out.println(b);
        System.out.println(getUserIndex);

    }
}
