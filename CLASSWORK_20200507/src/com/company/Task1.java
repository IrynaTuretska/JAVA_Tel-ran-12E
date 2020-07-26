package com.company;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(9%10);
        System.out.println(checkDigits(123)); //true
        System.out.println(checkDigits(133)); //false
        System.out.println(checkDigits(223)); //false
        System.out.println(checkDigits(555)); //false
        System.out.println(checkDigits(55)); // false
        System.out.println(checkDigits(7)); // false
    }

    public static boolean checkDigits(int xyz){
        if(getDigitFromHundreds(xyz)!=getDigitFromTens(xyz) &&
                getDigitFromHundreds(xyz)!=getDigitFromOnes(xyz)&&
                getDigitFromTens(xyz)!=getDigitFromOnes(xyz)
        )  {
            return  true;
        }
        return false;
    }
    public static int getDigitFromHundreds(int xyz){
        return xyz/100;
    }
    public static int getDigitFromTens(int xyz){
        return (xyz%100)/10;
    }
    public static int getDigitFromOnes(int xyz){
        return xyz%10;
    }

}
