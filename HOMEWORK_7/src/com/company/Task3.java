package com.company;

public class Task3 {

    /* 7_3. Дано целое число. Реализовать метод, который вернет сумму его разрядов.
    Обратите внимание, число может быть маленьким, а может быть большим.
    Пример: getSumOfDigits(5462)->17
            getSumOfDigits(5476213)->28 */

    public static void main(String[] args) {
        int number = 5462;
        int sum=0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);

    }
}
