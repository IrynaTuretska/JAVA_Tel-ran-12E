package com.company;

import java.util.Arrays;

public class BubbleSort {
    /*
        9 , 6, 7 ,2, 6
        6, 7, 2, 6, 9
        6, 2, 6, 7, 9
        2, 6, 6, 7, 9
     */
    public static void main(String[] args) {
        int[] arr=new int[]{1,5,0,3,45,15,6,27,8};
        Arrays.sort(arr);
        //
        print(arr);
        bubbleSort(arr);
        System.out.println("isArraySort -" + isArraySort(arr));
        print(arr);
    }

    public static void bubbleSort(int[] arr) {
        boolean swapFlag= true;
        int j=0;
        while (swapFlag==true && j<arr.length) {
            swapFlag = false;
            for (int i = 1; i < arr.length-j; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swapFlag = true;
                }
            }
            j++;
            //print(arr);
        }
    }


    public  static void print(int[] arr){
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    public static boolean isArraySort(int[] arr){
        for (int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
