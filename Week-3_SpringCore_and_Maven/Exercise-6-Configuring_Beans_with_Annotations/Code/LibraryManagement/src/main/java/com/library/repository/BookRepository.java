package com.library.repository;

import com.library.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository  // Annotation to tell Spring this is a repository bean
public class BookRepository {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("[BookRepository] Book added: " + book.getTitle());
    }

    public List<Book> getBooks() {
        return books;
    }
}
