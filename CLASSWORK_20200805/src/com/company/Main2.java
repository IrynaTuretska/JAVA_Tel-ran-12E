package com.company;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        Book[] books = {new Book(2003, "Dan Brown", "The Davinci's code."),
                new Book(2012, "Sean Hannity", "Live free or die."),
                new Book(2011, "Delia Owens", "Where the crawdads sing."),


        };
        System.out.println(books[0].compareTo(books[0]));

        Arrays.sort(books);
        System.out.println(Arrays.toString(books));

    }
}



