package com.company;

public class Main {

    public static void main(String[] args) {

        int[] ints = {1, 3, 2, 20, -9};

        System.out.println("Currebt Array:");
        print(currentArray(ints));
        System.out.println("Reversed Arrey:");
        print(newArrayReverse(ints));
        System.out.println("Summ of all elements: " + sumOfNumbers(ints));
        System.out.println("Maximum element: " + findMaxElement(ints));
        System.out.println("Minimun element: " + findMinElement(ints));
        System.out.println("Maximun Index: " + findMaxIndex(ints));
        System.out.println("Minimun Index: " + findMinIndex(ints));

    }

    public static void print(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();

    }

    public static int[] currentArray(int[] ints) {
        int[] array = new int[ints.length];
        for (int i = ints.length - 1; i >= 0; --i) {
            array[i] = ints[i];

        }
        return array;
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

    public static int sumOfNumbers(int[] ints) {
        int summ = 0;
        for (int i = 0; i < ints.length; i++) {
            summ = summ + ints[i];
        }
        return summ;
    }

    public static int findMaxElement(int[] ints) {
        int max = 0;
        for (int i = 0; i < ints.length; i++) {
            if (max < ints[i]) {
                max = ints[i];
            }
        }
        return max;
    }

    public static int findMinElement(int[] ints) {
        int min = 0;
        for (int i = 0; i < ints.length; i++) {
            if (min > ints[i]) {
                min = ints[i];
            }
        }
        return min;
    }

    public static int findMaxIndex(int[] ints) {
        int maximum = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > maximum){
                return i;
            }
        }
        return -1;
    }

    public static int findMinIndex(int[] ints) {
        int minimum = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < minimum) {
                return i;
            }
        }
        return -1;
    }

}
