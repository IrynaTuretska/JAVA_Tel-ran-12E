package com.company;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(new Author("O Henry"), "Best short stories", "roman", 234567);
        Book book2 = new Book(new Author("Robert Martin"), "Clean code", "study", 123456);
        Book book3 = new Book(new Author("J.D. Salinger"), "A perfect day for Bananafish", "roman", 345678);
        Book book4 = new Book(new Author("Somerset Maugham"), "Theatre", "roman", 456789);
        Book book5 = new Book(new Author[]{new Author("Кэти", "Сьерра"), new Author("Берт Бейтс")}, "Изучаем Java", "qwe", 657);

        BooksArray booksArray = new BooksArray(3);

        booksArray.add(book1);
        booksArray.add(book2);
        booksArray.add(book3);
        booksArray.add(book4);
        booksArray.add(book5);

        booksArray.print();

        System.out.println(booksArray.getBook(5)
                .titleAndAuthorsToString());


    }

}
