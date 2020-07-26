package com.company;

public class Main {

    public static void main(String[] args) {

        // слияние двух сортированных массивов

        int[] scope1 = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] scope2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newScope = new int[scope1.length + scope2.length];


        mergeSort(scope1, scope2, newScope);
        System.out.println("isArraySort -" + isArraySort(newScope));
        print(newScope);

    }

    public static void mergeSort(int[] scope1, int[] scope2, int[] newScope) {

        int i = 0, j = 0;
        for (int k = 0; k < newScope.length; k++) {

            if (i > scope1.length - 1) {
                int a = scope2[j];
                newScope[k] = a;
                j++;

            } else if (j > scope2.length - 1) {
                int a = scope1[i];
                newScope[k] = a;
                i++;
            } else if (scope1[i] < scope2[j]) {
                int a = scope1[i];
                newScope[k] = a;
                i++;
            } else {
                int b = scope2[j];
                newScope[k] = b;
                j++;
            }
        }
    }
    public static void print(int[] newScope) {
        for (int i:newScope) {
            System.out.print(i + " ___ ");
        }
        System.out.println();
    }

    public static boolean isArraySort(int[] newScope) {
        for (int i = 1; i < newScope.length; i++) {
            if (newScope[i] > newScope[i - 1]) {
                return true;
            }
        }
        return false;
    }
}