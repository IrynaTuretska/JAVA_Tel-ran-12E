package com.company;

public class Main {

    public static void main(String[] args) {

        // TEST for HOMEWORK_11

        Book book1 = new Book("Angels & Demons", "Dan Brown", "Adventure, mystery, conspiracy", 2000);
        Book book2 = new Book("The Da Vinci Code", "Dan Brown", "Adventure, mystery, conspiracy", 2003);
        Book book3 = new Book("The Lost Symbol", "Dan Brown", "Adventure, mystery, conspiracy", 2009);
        Book book4 = new Book("Inferno", "Dan Brown", "Adventure, mystery, conspiracy", 2013);
        Book book5 = new Book("Origin", "Dan Brown", "Adventure, mystery, conspiracy", 2017);


        System.out.println();
        Book[] books = {book1, book2, book3, book4, book5};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());

        }
    }
}

