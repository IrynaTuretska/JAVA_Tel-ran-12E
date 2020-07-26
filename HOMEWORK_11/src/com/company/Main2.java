package com.company;


public class Main2 {

    public static void main(String[] args) {
        Book2 book1 = new Book2("Angels & Demons", "Adventure, mystery, conspiracy", 2000);
        Book2 book2 = new Book2("The Da Vinci Code","Adventure, mystery, conspiracy", 2003);
        Book2 book3 = new Book2("The Lost Symbol","Adventure, mystery, conspiracy", 2009);
        Book2 book4 = new Book2("Inferno","Adventure, mystery, conspiracy", 2013);
        Book2 book5 = new Book2("Origin","Adventure, mystery, conspiracy", 2017);

        Author author = new Author("Dan Brown");

        book1.author=author;
        book2.author=author;
        book3.author=author;
        book4.author=author;
        book5.author=author;

        System.out.println();
        Book2[] books = {book1, book2, book3, book4, book5};
        for (int i = 0; i < books.length; i++) {
            books[i].print();

        }
    }
}

