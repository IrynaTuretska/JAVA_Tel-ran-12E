package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array;
        array =getArray(2, -1000,1000);

        print(array);
        int max=getMaxInArray(array,0,10);
        int maxIndex=getIndexMaxInArray(array,0,10);
        System.out.println("0..10  max= "+max + "   ["+maxIndex+"]");
        max=getMaxInArray(array,10,20);
        maxIndex=getIndexMaxInArray(array,10,20);
        System.out.println("10..20  max= "+max + "   ["+maxIndex+"]");

    }

    public static int[] getArray(int size, int min,int max){
        int[] arr=new int[size];
        for(int i=0;i<arr.length;++i){
            arr[i]=getRandomInt(min,max) ;
        }
        return arr;
    }
    public static int getRandomInt(int min, int max){
        return  (int)(Math.random()*(max-min+1)+min);
    }

    public static void print(int[] arr){
        for (int i=0;i<arr.length;++i){
            System.out.println("["+i+"]" +": "+ arr[i]);
        }
    }

    public static int getMaxInArray(int[] arr, int indexStart, int indexFinish) {
        if ((indexStart>=0)&&(indexFinish<arr.length)) {
            return arr[getIndexMaxInArray(arr, indexStart, indexFinish)];
        } else {
            System.out.println("Log: getMaxInArray error. Bad array index");
            return 0;
        }
    }

    public static int getIndexMaxInArray(int[] arr, int indexStart, int indexFinish) {
        /*
            indexStart=Math.min(indexStart,arr.length-1);
            indexStart=Math.max(indexStart,0);
            indexFinish = Math.min(indexFinish,arr.length);

         */

        if ((indexStart>=0)&&(indexFinish<arr.length)){
            int max = arr[indexStart];
            int maxIndex=indexStart;
            for (int i = indexStart; i < indexFinish; ++i) {
                if (max < arr[i]) {
                    max = arr[i];
                    maxIndex=i;
                }
            }
            return maxIndex;
        } else {
            System.out.println("Log: getIndexMaxInArray error. Bad array index");
            return 0;
        }

    }

    public static String[] test(int[] date,int a, int b){
        String[] jack={"jack","jack"};


        return jack;
    }

}
