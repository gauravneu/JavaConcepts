package com.testbook.mockito;

public class BookService {
    private BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    public void addBook(Book book){
        bookRepository.save(book);
    }

    public int findAllBooks(){
        return bookRepository.findAll().size();
    }

    public int findNumberOfBooks(){
        return bookRepository.findAll().size();
    }
}
