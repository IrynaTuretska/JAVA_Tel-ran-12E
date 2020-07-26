package com.company;

public class SelectSort {

    public static void main(String[] args) {
/*
        3 , 6, 9 ,2, 6   ->  2, 3 , 6, 6, 9
        [2] , 6  , 9 ,  3, 6
         2 , [3] , 9 ,  6, 6
         2 ,  3 , [6] , 9, 6
         2 ,  3 ,  6  , [6], 9
*/

        // O(n)

        int[] arr=new int[]{5,3,6,2,4,1,1,1};
        print(arr);
        selectSort(arr);
        System.out.println(test(arr));
        print(arr);
    }

    private static void selectSort(int[] arr) {
        for (int i=0;i<arr.length;i++){
            int minIndex=getMimIndex(arr,i);
            if(minIndex!=i){
                swap(arr,i,minIndex);
            }
        }
    }

    private static int getMimIndex(int[] arr, int startIndex) {
        int min=arr[startIndex];
        int iMin=startIndex;
        for (int i=startIndex;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                iMin=i;
            }
        }
        return iMin;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2] = temp;

    }

    public  static void print(int[] arr){
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    public static boolean test(int[] arr){
        for (int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
