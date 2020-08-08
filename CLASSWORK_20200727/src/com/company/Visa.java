package com.company;

public class Visa extends Card {

    public Visa(Person owner, String cardNumber) {
        super(owner, cardNumber);
    }

    @Override
    public String toString() {
        return "Visa: " + getOwner() +
                ", cardNumber='" + getCardNumber() + '\'';
    }

    @Override
    public String toSecureString() {
        return "Visa: " + getOwner() +
                ", cardNumber='" + getSecureNumber() + '\'';
    }

    private String getSecureNumber() {
        String star ="";
        for (int i=0; i<getCardNumber().length()-6; i++){
            star +="*";
        }
        return getCardNumber().substring(0,4)+star+getCardNumber().substring(getCardNumber().length()-2);
    }

}
