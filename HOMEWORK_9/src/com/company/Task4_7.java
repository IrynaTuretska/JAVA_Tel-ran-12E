package com.company;

public class Task4_7 {

    public static void main(String[] args) {

        int[] ints = {10, 3, 3, 5, -9};

        System.out.println(sumOfNumbers(ints));  // # 9.4
        System.out.println(findMaxElement(ints));  // # 9.5
        System.out.println(findMaxIndex(ints));  // # 9.6
        print(newArrayReverse(ints));  // # 9.7


    }

    public static int sumOfNumbers(int[] ints) {
        int summ = 0;
        for (int i = 0; i < ints.length; i++) {
            summ = summ + ints[i];
        }
        return summ;
    }

    public static int findMaxElement(int[] ints) {
        int maximum = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (maximum < ints[i]) {
                maximum = ints[i];
            }
        }
        return maximum;
    }

    public static int findMaxIndex(int[] ints) {
        int maximum = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == maximum) {
                return i;
            }
        }
        return -1;
    }

    public static void print(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");

        }
        System.out.println();
    }

    public static int[] newArrayReverse(int[] ints) {
        int[] reverse = new int[ints.length];
        int j = 0;
        for (int i = ints.length - 1; i >= 0; --i) {
            reverse[j] = ints[i];
            j++;
        }
        return reverse;
    }

}
