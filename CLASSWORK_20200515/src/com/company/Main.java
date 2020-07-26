package com.company;

public class Main {

    public static void main(String[] args) {
        printTriangle(10);
        printTriangle3(10);
        printTriangle5(10);
    }
    public static void printTriangle(int n){
        String str="*";
        for (int i=1;i<=n;i++){
            System.out.println(str);
            str=str+"*";
        }
    }

    public static void printTriangle2(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static void printTriangle3(int n) {

        int i=1;
        do{
            int j=1;
            do{
                System.out.print(j+" ");
                j++;
            }while(j<=i);
            System.out.println();
            i++;
        }while (i<=n);

    }

    public static boolean temp(){
        boolean flag=false;
        for (int i=1;i<100;i++){
            // if(getNameByIndex(i)=="jack") flag=true;
        }
        return flag;
    }



    public static void printTriangle4(int n){
        String str="1"; boolean flag = true;
        for (int i=1;i<=n;i++){
            System.out.println(str);
            flag=!flag;
            str=str+((flag)?"1":"0");
        }
    }
    public static boolean invert(boolean flag){
        return !flag;
    }

    public static void printTriangle5(int n) {
        boolean flag1=true;
        for (int i = 1; i <= n; i++) {
            boolean flag=flag1;
            for (int j = 1; j <= i; j++) {
                System.out.print((flag)?"1":"0");
                flag=!flag;
            }
            System.out.println("");
            flag1=!flag1;
        }
    }

}
/*

*
**
***
****
*****
******
1
1 2
1 2 3
1.....4

1
0 1
1 0 1
0 1 0 1

 */