package com.company;

public class Main3 {
    public static void main(String[] args) {
        int i;
        nameOfLabel:
        for (int j=0;j<4;j++){
            for(i = 0; i<6; i++){
                System.out.println(i);
                if(i==2) {
                    System.out.println("i==2");
                    break nameOfLabel;
                }
            }
            System.out.println("i after for " + i);
        }
    }
}
