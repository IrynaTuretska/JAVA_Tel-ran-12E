package com.company;

/*
Дано два целых положительных числа. Реализовать метод, который
для каждого числа от a до b печатает строку вида   “23 рубля”
Пример: printSumInRub(1,5) ->  1 рубль
			                   2 рубля
			                   3 рубля
				               4 рубля
				               5 рублей
	Решение:
	---------
    1. цикл перебора от a до b
    2. для каждого числа получаем нужную строку
       возможны всего 3 вариант  "рубль", "рублей", "рубля",
       причем выор зависит от последних цифр

 */


public class Main2 {

    public static void main(String[] args) {


        System.out.println(rubToString(187));

        printRubles(19, 29);
    }


    public static  void  printRubles(int a, int b){
        int i=a;
        while (i<=b) {
            System.out.println(rubToString(i));
            i=i+1;
        }
    }

    public static String rubToString(int rub){

        String rez="";
        int i=rub%10;
        if(rub%100>=11&&rub%100<=14){
            rez= " рублей";
        } else {
            switch (i) {
                case 1:
                    rez= " рубль"; break;
                case 2:
                case 3:
                case 4:
                    rez= " рубля"; break;
                default:
                    rez= " рублей";
            }
        }
        return rub + " "+rez;
    }
}

