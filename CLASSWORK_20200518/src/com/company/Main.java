package com.company;
/*
Дано целое трехзначное число. Написать метод, который определит четность/ нечетность разрядов этого числа:
Например: 123 -> 1 – нечет. 2- чет. 3-нечет.
	       768 ->  1 – нечет. 2- чет. 3-чет.

 */
public class Main {

    public static void main(String[] args) {

        System.out.println(checkEven(358));
        System.out.println(checkEven(222));
        System.out.println(checkEven(891));
    }

    
    public static int getDigitsFromHundreds(int xyz){
        return xyz=xyz/100;
    }

    public static int getDigitsFromTens(int xyz){
        return xyz=(xyz%100)/10;
    }

    public static int getDigitsFromOnes(int xyz){
        return xyz=xyz%10;
    }

    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        } else {
            return false;
        }
    }


    public static String isEvenToString(int num){
        return (isEven(num))?"четное":"не четное";
    }

    public static String checkEven(int xyz){

        int x=getDigitsFromHundreds(xyz);
        int y=getDigitsFromTens(xyz);
        int z= getDigitsFromOnes(xyz);

        return x+" -"+isEvenToString(x) + "  " +
                y+" -"+isEvenToString(y) + "  " +
                z+" -"+isEvenToString(z);
    }
}

