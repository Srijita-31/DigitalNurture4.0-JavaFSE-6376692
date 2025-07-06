package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    public void addBook(String title){
        System.out.println("Adding book: "+title);
    }
}