package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = getArray(15,0,30);
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("Array is sorted - "+ isArraySort(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        sort(arr,0,arr.length);
    }
    private  static void sort(int[] arr, int from,int to){
        if(to-from>1){
            int middle=(from+to)/2;
            sort(arr, from, middle);
            sort(arr,middle,to);
            merge(arr,from,middle,to);
        }
    }

    // from - start index for the first range [from .... middle-1]
    // middle - start index for the second range [middle ... to]в
    private static void merge(int[] arr, int from, int middle, int to) {
        int[] arr1= Arrays.copyOfRange(arr,from,middle);
        int[] arr2= Arrays.copyOfRange(arr,middle,to);

        int x1=0, x2=0;
        int i=from;
        while (x1<arr1.length&&x2<arr2.length){
            /*
            if(arr1[x1]<arr2[x2]){
                arr[i]=arr1[x1++];
            } else {
                arr[i]=arr2[x2++];
            }
            i++;
             */

            arr[i++]=(arr1[x1]<arr2[x2])?arr1[x1++]:arr2[x2++];
        }
        while (x1<arr1.length){
            arr[i++]=arr1[x1++];
        }
        while (x2<arr2.length){
            arr[i++]=arr2[x2++];
        }

    }


    public static int[] getArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return arr;
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
/*
                           i
            [5,8,20,35,40]

                     j
            [2,4,15,48,70]


            [2,4,5,8,15,20,35,40,48,70]


            [1, 0, 40,23,3,14,15,7]
        [1, 0, 40,23         ,3,14,15,7]
       [1,0,    40,23      ,3,14,     15,7]
     [1,  0,    40, 23      ,3,  14,     15,  7]
        0,1      23,40        3,14        7,15
            0,1,23,40           3,7,14,15
                0,1,3,7,14,15,23,40

 */