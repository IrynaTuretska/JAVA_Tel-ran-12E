package com.company;

import sun.awt.windows.WPrinterJob;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        byte[] bytes = new byte[]{1, 2, 3, -1, -6, 2, 1, 4, 1, 2, 1, -7, -1};

        System.out.println(wordCounter(bytes));
        Word[] words = getWrd(bytes);
        System.out.println(Arrays.toString(words));
    }

    public static Word[] getWrd(byte[] array) {
        Word[] wordsArray = new Word[wordCounter(array)];
        int wordSum =0;
        int j =0;
        for( int i=0; i<array.length; i++){
            if (array[i] < 0) {
                if(wordSum > 0){
                   wordsArray[j] = new Word(wordSum);
                   wordSum =0;
                   j ++;
                }
            } else {
              wordSum += array[i];
            }
        }
        if(wordSum>0){
            wordsArray[j] = new Word(wordSum);
        }
        return wordsArray;
    }
    public static int wordCounter(byte[] array) {
        int wordCounter = 0;
        int wordLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (wordLength > 0) {
                    wordCounter++;
                    wordLength = 0;
                }
            } else {
                wordLength ++;
            }
        }
        if (wordLength>0){
            wordCounter ++;
        }
        return wordCounter;
    }
}
