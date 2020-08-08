package com.company;

public class Word {
    private int sum;

    public Word(int sum){
        this.sum=sum;
    }

    public int getWord(){
        return sum;
    }

    public String toString(){
        return "Word: " + "sum = " + sum;
    }

}
