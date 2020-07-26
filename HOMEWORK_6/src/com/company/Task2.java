package com.company;


public class Task2 {

    public static void main(String[] args) {
        // write your code here
        ptintTriangle(10);
        printTriangle2(10);
        printTriangle3(10);
    }

    public static void ptintTriangle(int n) {
        String str = "*";
        for (int i = 1; i <= n; i++) {
            System.out.println(str);
            str = str + "*";
        }
    }

    public static void printTriangle2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }
    public static void printTriangle3(int n){
        int i=1;
        do{
            int j=1;
            do{
                System.out.print(j +" ");

                j++;
            }while(j<=i);
            System.out.println();
            i++;
        }while (i<=n);
    }
}
