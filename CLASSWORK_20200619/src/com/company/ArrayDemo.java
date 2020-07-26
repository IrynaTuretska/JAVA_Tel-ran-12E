package com.company;

public class ArrayDemo {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,2,3,9},
                {4,5,6},
                {4,5,6,9,8}
        };
        //System.out.println(arr[0][2]); // [строка][столбец]
        //System.out.println(arr[1][2]);

        for (int i=0; i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        int[][] arr2 = new int[][]{
                {1,2,3,9},
                {4,5,6,8},
                {4,5,6,9}
        };

        int[] arr3=arr2[0];

        int[][][] arr4 = new int[][][]{{
                {1,2,3,9},
                {4,5,6,8},
                {4,5,6,9}
        },{
                {10,20,30,90},
                {40,50,60,80},
                {40,50,60,90}
        }   };

        System.out.println(arr4[1][0][0]);

    }
}
