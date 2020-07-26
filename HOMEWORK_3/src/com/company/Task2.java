package com.company;

public class Task2 {

    public static void main(String[] args) {
        //3_2. Дано целое трехзначное число.
        // Написать метод, который возвращает сумму разрядов этого числа.
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
            int hundreds=number/100;
            int ones=number%10;
            int tens =((number-(hundreds*100)) -ones);
            return (hundreds + tens/10 + ones);
        }
        return 0;
    }

}