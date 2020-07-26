package com.company;

public class Main4 {

    public static void main(String[] args) {
        int [] nint={45,4,5,7,98};
        System.out.println(min(nint));
        // write your code here
    }

    public  static int min(int [] nint){
        int min = nint[0];
        int indexMin=0;
        for (int i=1; i<nint.length;i++){
            if (min>nint[i]){
                min=nint[i];
                indexMin=i;

            }
        }
        return indexMin;
    }
}
