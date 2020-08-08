package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] cardNum = {"1245678901111111 Andy", "1387654321112222 Andy2", "1234567890983333 Andy3"};
        Card[] cards = cardArr(cardNum);
        System.out.println(Arrays.toString(cards));
        printArrayCard(cards);

    }

    public static Card[] cardArr(String[] array) {
        Card[] cards = new Card[array.length];
        for (int i = 0; i < array.length; i++) {
           String[] res = array[i].split(" ");

           switch (getCardType(res[0])) {
               case 1:
                   cards[i] = new Master(new Person(res[1]), res[0]);
                   break;
               case 2:
                   cards[i] = new Visa(new Person(res[1]), res[0]);
                   break;
               default:
                   System.out.println("ERROR");
              }
           }
        return cards;
        }

    public static int getCardType(String number) {

        if (number.startsWith("12")) return 1;
        if (number.startsWith("13")) return 2;
        return 0;
}
 public static void printArrayCard(Card[] cards){
    for (Card card:cards){
        System.out.println(card.toSecureString());
       }
    }
}

