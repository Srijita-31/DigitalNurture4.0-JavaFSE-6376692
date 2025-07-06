package com.library.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class BookRepository {

    private List<String> list = new ArrayList<>();

    public void saveBook(String title) {
        System.out.println("Saving book: " + title);
        list.add(title);
    }

    public List<String> getBooks(){
        System.out.println("Showing all books:");
        return list;
    }
}