package com.company;

public class Main4 {

    public static void main(String[] args) {
        String[] names= {"Jack","Valeriya","Nick","Slava","Nickolaus"};
        String[] names2= {"Nick","Jack","Nick","Nickolaus"};
        printNames(names);
        String name="Slava";
        System.out.println("name: "+ name + " is "+ isNamePresent(name,names));
        System.out.println("------------------------------------");
        printPresentNames(names,names2);
        System.out.println("name: "+ name+ " index is "+ findName(name,names));
        int[] ints = {4,6,8,2,124,4,1,7,86};

    }

    public static void printNames(String[] names){
        for (int i =0;i<names.length;i++){
            if(names[i].length()<=5){
                System.out.println(names[i]);
            }
        }
    }

    public static boolean isNamePresent(String name, String[] names){
        for (int i=0;i<names.length;i++){
            if(names[i].equals(name) ) { //names[i]==name
                return true;
            }
        }
        return false;
    }

    public static void printPresentNames(String[] list, String[] present){
        for(int i=0; i<list.length;i++){
            if(   isNamePresent(list[i],present)   ){
                System.out.println(list[i] + " is present");
            } else {
                System.out.println(list[i] + " is absent");
            }
        }
    }

    public static int findName(String name, String[] names){
        for (int i=0;i<names.length; i++){
            if(names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static int max(int[] ints){
        int max = ints[0];
        for (int i=1; i<ints.length;i++){
            if(max<ints[i]){
                max=ints[i];
            }
        }
        return max;

        //  [105] [115] [110] [107]
        // max=115
    }
}