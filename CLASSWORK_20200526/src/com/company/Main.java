package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getPrimeNumbers(10,200000));
    }

    public static String getPrimeNumbers(int a, int b){
        String resString="";
        int min=(a>b)?b:a;
        int max=(a>b)?a:b;

        for (int i = min; i<=max; i++){
            boolean isPrime=true;
            for (int j = 2; isPrime && (j<=i/2);j++){
                if( (i%j)==0 ){
                    isPrime=false;
                }
                //if (!isPrime)break;
            }
            if(isPrime){
                resString=resString + i + " ";
            }
        }
        /*
        10   2
        11   2  3  4 5
        i=i+val => i+=val;


         */


        return resString;
    }
}
