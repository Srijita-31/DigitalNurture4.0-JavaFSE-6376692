package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepository bookRepository;
    private String serviceName;

    @Autowired
    public BookService(@Value("${book.service.name}")String serviceName) {
        this.serviceName = serviceName;
    }

    //setter based injection
    @Autowired
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void addBook(String title){
        System.out.println("Adding book: "+title);
        bookRepository.saveBook(title);
    }

    public void displayAll(){
        System.out.println("------------------------------------");
        System.out.println("Service: " + serviceName);
        System.out.println("------------------------------------");
        bookRepository.getBooks().forEach(System.out::println);
        System.out.println("------------------------------------");
    }

}