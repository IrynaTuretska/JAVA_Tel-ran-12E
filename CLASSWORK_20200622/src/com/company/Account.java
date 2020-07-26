package com.company;

public class Account {
    private String IBAN;
    private Person client;
    double balance;

    public Account(String IBAN, Person client, double balance) {
        this.IBAN = IBAN;
        this.client = client;
        this.balance = balance;
    }

    public String getIBAN() {
        return IBAN;
    }

    public Person getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account: " + IBAN + " client=" + client.toString() +
                " balance=" + balance;
    }

    public String secureToString() {
        return "Account: " + ibanSecureToString() + " client=" + client.toString() +
                " balance=" + balance;
    }

    public String ibanSecureToString(){
        if (IBAN.length()>6){
            String res=IBAN.substring(0,4); // add four lead chars

            // add stars
            for ( int countStars=IBAN.length()-6; countStars>0;countStars--, res+="*");
            /*
            int countStars=IBAN.length()-6;
            while (countStars>0){
                res+="*";
                countStars--;
            }
             */
            res+=IBAN.substring(IBAN.length()-2);  // add two last chars

            return res;
        } else {
            return IBAN;
        }
    }
}
