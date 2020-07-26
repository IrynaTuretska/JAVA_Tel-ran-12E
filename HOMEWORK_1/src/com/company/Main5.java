package com.company;

public class Main5 {

    public static void main(String[] args) {
        // Задача №6: задача checkDebit

        System.out.println("Requested amount is: " + checkDebit(200, 400));

    }
    public static boolean checkDebit(int account, int debitAmount){
        return (account > debitAmount);
    }

}