package com.company;

public class Book {
    String title;
    String author;
    String genre;
    int yearOfPublishing;

    public Book(String title, String author, String genre, int yearOfPublishing){

        this.title= title;
        this.author=author;
        this.genre=genre;
        this.yearOfPublishing=yearOfPublishing;

    }
    public String toString(){return "BOOK: " + title + "; "+ author + "; "+  genre +"; " +yearOfPublishing;}

}
