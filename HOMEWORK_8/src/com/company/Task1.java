package com.company;

public class Task1 {

    public static void main(String[] args) {
        // write your code here

        System.out.println(returnResult( 100, 97));
    }

    public static int returnResult(int currentSpeed, int desiredSpeed) {
        if ((currentSpeed - desiredSpeed) > currentSpeed/desiredSpeed){
            return  (desiredSpeed + (desiredSpeed/100)*3);

        } else {
            return (desiredSpeed - (desiredSpeed/100)*3);

        }
    }
}
