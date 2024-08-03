package com.dagmawi.LIBRARY_MANAGEMENT_SYSTEM_SB.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Book {

    private String title;
    private String author;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ISBN;
    private boolean isBorrowed;


    public Book() {

    }

    public Book(String title, String author, String ISBN, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = isBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
