package com.book;

import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String author;
    private long ISBN;

    public Book(String title, String author, long ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "\nTitle: "+ "《" + title +"》" + "    Author: " + author + "    ISBN: " + ISBN;
    }

}
