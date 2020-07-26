package com.company;

public class Main3 {

    public static void main(String[] args) {
        boolean tempCorrect = isTempCorrect(90);
        System.out.println(tempCorrect);
        tempCorrect = isTempCorrect(190);
        System.out.println(tempCorrect);
    }

    public static boolean isTempCorrect(int temp){
        if ( (temp>10)&&(temp<100) ) {
            return true;
        } else {
            return false;
        }


    }

}
