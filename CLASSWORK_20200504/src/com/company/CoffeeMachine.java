package com.company;

public class CoffeeMachine {

    public static void main(String[] args) {
        String coffee=choiceCoffee(2);
        print(coffee);
        System.out.println("--------------------");
        coffee = choiceCoffee(5);
        print(coffee);

    }

    public static String choiceCoffee(int coffeeType){
        String rez="error";
        switch (coffeeType){
            case 1: //espresso
                rez= (coffeeMaker(1,1,false)) ? "espresso":rez;
                break;
            case 2: //latte
                rez= (coffeeMaker(3,2,true)) ? "latte":rez;
                break;
            case 3://milk caffee
                rez= (coffeeMaker(0,1,true)) ? "espresso":rez;
                break;

        }
        return rez;
    }

    public static boolean coffeeMaker(int water, int coffee, boolean milk ){
        // make caffee
        return true;
    }

    public static void print(String coffeeString){
        if(coffeeString!="error"){
            System.out.println("Ваш "+ coffeeString +" готов");
        } else {
            System.out.println("что то не так!");
        }
    }
}
