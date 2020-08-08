package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] names = {
                "Ivanov Ivan Ivanovich",
                "Petrov Petr",
                "Nikolaev",
                "Sidorov John Ivanovich"
        };
        Person[] people = getPersonFromArrayOgString(names);
        System.out.println(Arrays.toString(people));
        System.out.println("---------------------");
        printPersons(people);
    }

    public static Person[] getPersonFromArrayOgString(String[] names) {
        Person[] people = new Person[names.length];
        if (names != null) {
            people = new Person[names.length];
            for (int i = 0; i < names.length; i++) {
                String[] namesStrings = names[i].split(" ");
                switch (namesStrings.length) {
                    case 1: people[i] = new Person(namesStrings[0]);break;
                    case 2: people[i] = new Person(namesStrings[0], namesStrings[1]);break;
                    case 3: people[i] = new Person(namesStrings[0], namesStrings[2]);break;
                }
            }
        }
        return people;
    }
    public static void printPersons(Person[] people){
        for(Person p:people){
            System.out.println(p.toStringInitials());
        }
    }
}

/*       String[] fullNames = {"Иванов Иван Иванович", "Николаев Николай", "Петрова"};
        getInitials(fullNames);
    }

    public static void getInitials(String[] array) {
        String[] fullNames = new String[array.length];

        for (int i = 0; i < array.length - 1; i++) {
            String[] res = array[i].split(" ");

            System.out.println(array[0].charAt(0) + ". " + array[0]);
            i++;

            }
            System.out.println(array[array.length - 1]);

        }
    }

*/
