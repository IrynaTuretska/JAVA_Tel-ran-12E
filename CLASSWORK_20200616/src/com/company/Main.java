package com.company;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(new Author("O Henry"), "Best short stories", "roman", 234567);
        Book book2 = new Book(new Author("Robert Martin"), "Clean code", "study", 123456);
        Book book3 = new Book(new Author("J.D. Salinger"), "A perfect day for Bananafish", "roman", 345678);
        Book book4 = new Book(new Author("Somerset Maugham"), "Theatre", "roman", 456789);


        Author author1 = new Author("Кэти", "Сьерра");
        Author author2 = new Author("Берт Бейтс");
        Author[] authors = new Author[]{author1, author2};
        Book book5 = new Book(authors, "Изучаем Java", "qwe", 657);
        Book[] books = new Book[]{book1, book2, book3, book4, book5};

        BooksArray booksArray = new BooksArray(books);
        booksArray.print();

        System.out.println("--------------------------------");
        BooksArray booksArray1 = new BooksArray(100);
        booksArray1.add(book1);
        booksArray1.add(book3);
        booksArray1.print();

    }
}
