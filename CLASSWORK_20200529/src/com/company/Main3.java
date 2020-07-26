package com.company;

public class Main3 {

    public static void main(String[] args) {

        int[] ints = {4, 6, 8, 20, 124, 4, 10, 7, 86};
        System.out.println("number 10 & 20 " + findNumbers(ints));
    }

    public static boolean findNumbers(int[] ints) {

        for (int i = 0; i < ints.length; i++) { // i 0..2
            for (int j = 0; j < ints.length; j++) { // j 0..2
                if ((ints[i] == 10) && (ints[j] == 20)){
                    return true;
                }
            }
        }
        return false;
    }
}
/*
10 3 20
        j
i= 0: 0,1, 2
i=1: 0,1, 2
i=2: 0,1, 2


 */