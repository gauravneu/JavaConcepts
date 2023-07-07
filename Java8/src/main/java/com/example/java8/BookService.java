package com.example.java8;

import java.util.Collections;
import java.util.List;

public class BookService {
    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }

//    class MyComparator implements Comparator<Book> {
//        @Override
//        public int compare(Book o1, Book o2) {
//            return o1.getName().compareTo(o2.getName());
//        }
//    }

    public List<Book> getBooksInSort() {
        List<Book> books = new BookDao().getBooks();

        //Old Method
//        Collections.sort(books, new MyComparator());

//        Collections.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        Collections.sort(books, (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });


        return books;
    }
}
