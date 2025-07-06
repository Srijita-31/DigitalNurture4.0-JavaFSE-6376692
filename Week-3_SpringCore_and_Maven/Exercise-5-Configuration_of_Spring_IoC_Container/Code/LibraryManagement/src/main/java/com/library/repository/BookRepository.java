package com.library.repository;

import com.library.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("[BookRepository] Book added: " + book.getTitle());
    }

    public List<Book> getBooks() {
        return books;
    }
}
