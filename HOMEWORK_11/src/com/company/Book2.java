package com.company;

public class Book2 {
    String title;
    String genre;
    int yearOfPublishing;
    Author author;

    public Book2 (String title, String genre, int yearOfPublishing) {
        this.title = title;
        this.genre = genre;
        this.yearOfPublishing = yearOfPublishing;

    }
    public void print(){
        System.out.println(title + " "+ genre + " " + yearOfPublishing +" "+  author.toString());
    }
    // public String toString(){return "BOOK: " + title + "; "+  genre +"; " +yearOfPublishing;}

}
