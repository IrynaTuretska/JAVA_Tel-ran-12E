package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getStringAndy());
        String s= getStringAndy();
        String s1= s+ getStringAndy();
        System.out.println(s1);
        System.out.println(isAndy(getStringAndy()));
        iceCream(13);

    }

    public static boolean isAndy(String s){
        return s=="Andy";
    }
    public static   String getStringAndy(){
        print("Nick","mr.",false);
        return "Andy";
    }

    public static int method(boolean flag){
        return (flag)?100:-100;
    }

    public static double getPi(){
        return 3.14159;
    }

    public static void print(String name, String prefix, boolean bool){
        if(name.length()>5){
            System.out.println("HellllOOoooo!");
            return;
        }
        String msg= "  my best friend, so lucky I am. ";
        System.out.println(prefix+" "+name + msg);
        int num =16;
        int i=10;

        ////////

        i=(i<10)? ( (i>0)? 5:10+i * method(true) ) :i- method(false);


    }
    public static void iceCream(int i){

        switch(i/2){
            case 10:
            case 11:
                System.out.println("пломбир");
                break;
            case  13:
                System.out.println("пломбир");
                System.out.println("пломбир шок.");
                System.out.println("стаканчик");
                break;
            case 20:
                System.out.println("пломбир");
                System.out.println("пломбир шок.");
                System.out.println("стаканчик");
                System.out.println("Брикет");
                break;
            default:
                System.out.println("err");
        }

    }


/*
if (condition) { block true  } else { bloc false  }
if (condition) { block true  }

var= (condition)? true expression : false expression;
String s = (num%2==0)? "чет" : "не чет";

switch(var) {
   case var1:
                command1;
                command2;
                break;
   case var2:
                 command3;
                 command4;
                 break;
   case var3:
                command5;
                command6;
                break;
   default:
                command7;
}


while (condition) {     }

do{   }while (condition)

for(init; condition  ;i++ )


    int i=5; int n=10;
    while (i<n) {
       command1;
       command2;
       command3;
       i=i*2;
    }

    do{
       command1;
       command2;
       command3;
       i++;
    }while(condition)


   for(i=0; i<n  ;i++ ){

   }

  int b;
  b=10;
    ----
    ----
  b=b*2;
  b=b/10;

 */

}