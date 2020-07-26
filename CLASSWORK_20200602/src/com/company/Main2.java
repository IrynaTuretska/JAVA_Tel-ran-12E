package com.company;

public class Main2 {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        System.out.println(arrToString(arr));
        reverseArray(arr);
        System.out.println(arrToString(arr));
        reverseArray2(arr);
        System.out.println(arrToString(arr));
    }

    //9_8
    public static void reverseArray(int[] array) {
        // [6][2][3][4][5][1]
        for (int i = 0; i <= array.length / 2; i++) {
            int temp = array[i];  // 1
            array[i] = array[array.length -i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    //9_8
    public static void reverseArray2(int[] array) {
        // [6][2][3][4][5][1]   left->    <-right
        int left=0;
        int right =array.length  - 1;
        while (left<right) {
            int temp = array[left];       //
            array[left] = array[right];   // swap([left],[right])
            array[right] = temp;          //
            left++;
            right--;
        }
    }



    public static String arrToString(int[] array){
        String str="";
        for (int i=0;i<array.length;i++){
            str+=array[i] +"  ";
        }
        return str;
    }
    // [1][2][3][4][5][6]
    // [6][5][4][3][2][1]

    // [6][2][3][4][5][1]
    // [6][5][3][4][2][1]
    // [6][5][4][3][2][1]

    //array[i] swap array[array.length-i-1]

}