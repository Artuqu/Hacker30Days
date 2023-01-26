package com.hackerrank.days;

import com.hackerrank.objects.Book;
import com.hackerrank.objects.MyBook;

import java.util.Scanner;

public class Abstract {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        Integer price = scanner.nextInt();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
