package com.company;

public class Main2 {

    public static void main(String[] args) {
        System.out.println(getPrimeNumbers(10,200000));
    }

    public static String getPrimeNumbers(int a, int b){
        String resString="";
        int min=(a>b)?b:a;
        int max=(a>b)?a:b;

        for (int i = min; i<=max; i++){
            if(isNumberPrime(i)){
                resString=resString + i + " ";
            }
        }
        return resString;
    }

    public static boolean isNumberPrime(int num){
        for (int j = 2; j<=num/2;j++){
            if( (num%j)==0 ){
                return false;
            }
        }
        return  true;
    }

}