package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("[BookService] BookRepository has been set via setter injection.");
    }

    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    public void displayBooks() {
        System.out.println("[BookService] Displaying books from repository:");
        List<Book> books = bookRepository.getBooks();
        if (books.isEmpty()) {
            System.out.println("No books found.");
        } else {
            for (Book book : books) {
                System.out.println("- \"" + book.getTitle() + "\" by " + book.getAuthor());
            }
        }
    }
}
