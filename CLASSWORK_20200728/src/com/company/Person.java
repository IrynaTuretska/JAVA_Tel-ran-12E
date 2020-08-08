package com.company;

public class Person {
    private String firstname;
    private String surname;
    private String fatherName;

    public Person(String firstname, String surname,  String fatherName) {
        this.firstname = firstname;
        this.surname = surname;
        this.fatherName = fatherName;

    }

    public Person(String firstname, String surname) {
        this(firstname, surname, "");
    }

    public Person(String firstname) {
        this(firstname, "", "");
    }

    @Override
    public String toString() {
        return "Person: " +
                "first name='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }


    public String toStringInitials() {
        return surname + " " +
                ((firstname.length() > 0) ? firstname.substring(0, 1) + "." : firstname) +
                ((fatherName.length() > 0) ? fatherName.substring(0, 1) + "." : fatherName);
    }
}
