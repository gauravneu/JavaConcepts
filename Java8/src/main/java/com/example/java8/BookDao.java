package com.example.java8;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Core Java 1", 400));
        books.add(new Book(102, "Hore Java 2", 300));
        books.add(new Book(103, "Bore Java 3", 200));
        books.add(new Book(104, "Dore Java 4", 100));
        return books;
    }
}
