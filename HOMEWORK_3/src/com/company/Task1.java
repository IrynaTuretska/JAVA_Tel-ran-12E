package com.company;

public class Task1 {
    // 3_1. Дано целое трехзначное число. Написать метод, который возвращает число, записанное в обратном порядке.


    public static void main(String[] args) {
        int number=432;
        int switchDigit= switchDigits(number);
        if (switchDigit ==0) {
            System.out.println("error");
        } else {
            System.out.println(switchDigit);
        }

    }
    public static int switchDigits(int number){
        if ((number>=100)&&(number<1000)){
            int handreds=number/100;
            int ones=number%10;
            int tens =((number-(handreds*100)) -ones);
            return (((ones*100)) + tens + ones*2);
        }
        return 0;
    }

}