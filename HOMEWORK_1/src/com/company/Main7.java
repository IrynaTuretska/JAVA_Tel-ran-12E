package com.company;

public class Main7 {

    public static void main(String[] args) {
        // Задача №8: checkDebit= amount + bank commission.


        System.out.print("Amount correct! - " + checkDebit(200, 201.3));
    }
    public static boolean checkDebit(double debitAmount, double account) {
        return ((debitAmount+(account/debitAmount))> account);
    }
}

