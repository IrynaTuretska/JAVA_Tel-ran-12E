package com.company;

public class Main2 {

    public static void main(String[] args) {
        System.out.println(getResult(4,10));
        System.out.println(getResult2(4,10));
    }

    public static String getResult(int a, int b){
        String result="";
        int i=a;
        while (i<=b){
            if(i%4==0) {

                int j =i;

                while (j<=i+5){
                    result += j + " ";
                    j++;
                }

            }
            i++;
        }
        return result;
    }

    public static String getResult2(int a, int b){
        String result="";
        for ( int i=a; i<=b; i++){
            result+=i+" ";
        }
        return result;

    }


/*
var = var+10;   var+=10;
var = var-10;   var-=10;
var = var*10;   var*=10;
var = var/10;   var/=10;
var = var%10;   var%=10;
 */


/*
while() {    }
do{   }while( )
for( init ; condition ; change){ }

"hello"
result+5+8
"hello5" + "8"
"hello58"

result+(5+8)
result+(13)
result+"13"
"hello13"
 */


}
