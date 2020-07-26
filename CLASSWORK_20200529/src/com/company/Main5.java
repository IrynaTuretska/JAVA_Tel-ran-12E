package com.company;

public class Main5 {

    public static void main(String[] args) {
        int[] ints = {10,20,30,40,50,60};
        print(ints);
        print(reverseArray(ints));


    }

    public static void print(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }

    public static int[] reverseArray(int[] array){
        int[] reverse = new int[array.length];

        int j=0;
        for (int i=array.length-1;i>=0;--i){
            reverse[j] = array[i];
            j++;
        }

        return reverse;
    }
//  [1]  [2] [3]  array    i
//  [3] [2] [1]  revers   j

}
