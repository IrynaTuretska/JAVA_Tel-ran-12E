package com.company;

public class PrivatePerson extends Card {

    public PrivatePerson(Person owner, String cardNumber) {
        super(owner, cardNumber);
    }

    @Override
    public String toString() {
        return "Master: " + getOwner() +
                ", cardNumber='" + getCardNumber() + '\'';
    }

    @Override
    public String toSecureString() {
        return "Master: " + getOwner() +
                ", cardNumber='" + getSecureNumber() + '\'';
    }
    public String getSecureNumber() {
        String star = "";
        for (int i = 0; i < getCardNumber().length() - 4; i++) {
            star += "*";
        }
        return getCardNumber().substring(0, 2) + star + getCardNumber().substring(getCardNumber().length() - 2);
    }

}
