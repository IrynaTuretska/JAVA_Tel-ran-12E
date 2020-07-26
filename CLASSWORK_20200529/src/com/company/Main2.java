package com.company;
// O(n)
public class Main2 {

    public static boolean are10And2There(int[] num){
        int i=0;
        int counter20=0;
        int counter10=0;
        while(i<num.length){
            if(num[i] == 20){
                counter20++;
            }
            if (num[i] == 10){
                counter10++;
            }
            //if(counter20>0 && counter10>0) break;
            i++;
        }
        return counter20>0 && counter10>0;
    }

    public static void main(String[] args) {
        int num[] = {1,3,20,4,5,6,10};
        System.out.println(are10And2There(num));
    }
}