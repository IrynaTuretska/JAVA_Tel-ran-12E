package com.company;

public abstract class Card {
    public Person owner;
    public String cardNumber;


    public Card(Person owner, String cardNumber) {
        this.owner = owner;
        this.cardNumber = cardNumber;


    }

    public Person getOwner() {
        return owner;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String toString() {
        return "Card: " + owner +
                ", cardNumber='" + cardNumber + '\'';

    }

    public abstract String toSecureString();
}
