package com.code.library.controller;

import com.code.library.entity.Book;
import com.code.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable long id){
        return bookRepository.findById(id).orElse(null);
    }

    @PostMapping("/add-book")
    public Map<String, String> addBook(@RequestBody Book book){
        bookRepository.save(book);
        return Map.of("message","Book added successfully");
    }

    @DeleteMapping("/delete-book/{id}")
    public Map<String, String> deleteBook(@PathVariable long id){
        bookRepository.deleteById(id);
        return Map.of("message", "Book deleted successfully");
    }

}
