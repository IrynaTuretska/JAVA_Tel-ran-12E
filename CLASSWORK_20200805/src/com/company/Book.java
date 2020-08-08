package com.company;

public class Book implements Comparable<Book> {
    private int yearOfPublishing;
    private String author;
    private String title;


    public Book(int yearOfPublishing, String author, String title) {
        this.yearOfPublishing = yearOfPublishing;
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "( Book: " + yearOfPublishing + ", " + author + " - " + title + '\'' +
                ')';
    }

    public int compareTo(Book book) {
        //int authorComparing = this.author.compareTo(book.author);
        return this.author.compareTo(book.author);
    }


/*
    public int compareTo(Book book) {
        int titleComparing = this.title.compareTo(book.title);
        return titleComparing;

    }

    public int compareTo(Book book) {
        int yearOfPublishingComparing = this.yearOfPublishing.compareTo(book.yearOfPublishing);
        return yearOfPublishingComparing;
*/

    }
