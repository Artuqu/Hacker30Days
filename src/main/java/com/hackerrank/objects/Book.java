package com.hackerrank.objects;

public abstract class Book {
    private final String title;
    private final String author;
    private final int price;

    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
