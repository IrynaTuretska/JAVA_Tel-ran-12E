package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] cardNum = {":Til Schweiger DE15971891", "AG:Macrosoft DE15978765",
                "GmbH:Pupkin SoftLab DE15954356", "e.V.:PupkinSoftLab DE15954356"};
        Card[] cards = cardArr(cardNum);
        System.out.println(Arrays.toString(cards));
        printArrayCard(cards);

    }

    public static Card[] cardArr(String[] array) {
        Card[] cards = new Card[array.length];
        for (int i = 0; i < array.length; i++) {
            String[] res = array[i].split(":");

            switch (getCardType(res[0])) {
                case 1:
                    cards[i] = new PrivatePerson(new Person(res[0]), res[0]);
                    break;
                case 2:
                    cards[i] = new CorporatePerson(new Person(res[1]), res[0]);
                    break;
                default:
                    System.out.println("ERROR");
            }
        }
        return cards;
    }

    public static int getCardType(String number) {

        if (number.startsWith(":")) return 1;
        if (number.startsWith("13")) return 2;
        return 0;
    }
    public static void printArrayCard(Card[] cards){
        for (Card card:cards){
            System.out.println(card.toSecureString());
        }
    }
}