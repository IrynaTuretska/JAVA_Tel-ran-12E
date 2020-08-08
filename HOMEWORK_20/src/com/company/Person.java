package com.company;

public class Person {
    private String firstName;
    private String surname;
    private String IBAN;

    public Person(String firstName, String surname,  String IBAN) {
        this.firstName = firstName;
        this.surname = surname;
        this.IBAN = IBAN;

    }

    public Person(String firstname) {
        this(firstname, "", "");
    }

    @Override
    public String toString() {
        return "Person: " +
                "first name='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", IBAN='" + IBAN + '\'' +
                '}';
    }


    public String toStringInitials() {
        return surname + " " +
                ((firstName.length() > 0) ? firstName.substring(0, 1) + "." : firstName) +
                ((IBAN.length() > 0) ? IBAN.substring(0, 1) + "." : IBAN);
    }
}