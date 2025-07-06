package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // Marks this class as a service bean
public class BookService {

    @Autowired  // Auto-wires BookRepository bean
    private BookRepository bookRepository;

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
                System.out.println("- " + book);
            }
        }
    }
}
