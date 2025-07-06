package com.library;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class LibraryManagementApplication {
    public static void main(String[] arr){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookRepository bookRepository = applicationContext.getBean("bookRepository", BookRepository.class);
        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        //checking the configuration
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        bookService.addBook(title);
        bookRepository.saveBook(title);
        sc.close();
    }
}