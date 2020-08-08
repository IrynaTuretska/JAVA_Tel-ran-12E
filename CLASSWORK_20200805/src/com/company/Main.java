package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        String[] names ={"Jack","Nick","John","Anna"};
        System.out.println( names[0].compareTo(names[0])); // 0  Jack=Jack
        System.out.println( names[1].compareTo(names[0])); // 4  Nick>Jack
        System.out.println( names[0].compareTo(names[1])); // -4 Jack<Nick
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println();

        Person[] people = {new Person("Jack",67),
                new Person("Nick",25),
                new Person("John",80),
                new Person("Anna",18),
                new Person("Nick",18),
                new Person("Anna",23),
        };
        //System.out.println(people[0].compareTo(people[3]));
        //Arrays.sort(people);

        Comparator<Person>typeOfSorting;
        int key = 1;  // switch the key: 1 for age & 2 for name.
        switch (key){
            case 1: //sort by age
                 System.out.println("~~~~~~~~~~SORT BY AGE:~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                 typeOfSorting = new PersonComparatorByAge();
                 Arrays.sort(people, typeOfSorting);
                 break;
            case 2: //sort by name
                System.out.println("~~~~~~~~~~SORT BY NAME:~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                typeOfSorting = new PersonComparatorByName();
                Arrays.sort(people, typeOfSorting);
                break;
     /*
            case 3:
                Arrays.sort(people, (o1,o2)->o1.getAge()-o2.getAge()); // "синтаксический сахар"
            break;
     */

            default:
                System.out.println("~~~~~~~~~~sort by default:~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                Arrays.sort(people);
        }

        System.out.println(Arrays.toString(people));
        System.out.println("----------SORT BY AGE:----------------------------------");
        Arrays.sort(people, new PersonComparatorByAge());
        System.out.println(Arrays.toString(people));
        System.out.println("----------SORT BY NAME:---------------------------------");
        Arrays.sort(people, new PersonComparatorByName());
        System.out.println(Arrays.toString(people));
    }
}