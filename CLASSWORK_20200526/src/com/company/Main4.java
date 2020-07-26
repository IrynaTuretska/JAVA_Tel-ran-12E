package com.company;

public class Main4 {

    public static void main(String[] args) {
        String[] names = {"Jack","Nick","John","Romana"};
        String[] names2 = {"Lena","Ira","Olga","Nata"};
        String[] names3;
        String[] paar =  new String[4];
        int[] assa = new int[7];

        names3 = names2;
        names3[1]="Sveta";
        print(names);
        print(names2);
        System.out.println("--------------");
        names3=getPaar(names,names2);
        print(names3);
    }

    public static void print(String[] arr){
        for (int i=0;i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public static String[] getPaar(String[] arr1, String[] arr2){
        String[] paar =  new String[arr1.length];
        for (int i=0;i<paar.length; i++){
            paar[i]= arr1[i]+" + " + arr2[i];
        }
        return paar;
    }
}