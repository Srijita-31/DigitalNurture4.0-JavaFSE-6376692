package com.library;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class LibraryManagementApplication {
    public static void main(String[] arr){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        //checking the configuration
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books:");
        int n = sc.nextInt();
        sc.nextLine();
        int i=0;
        while(i<n){
            System.out.print("Enter book title "+(i+1)+": ");
            String title = sc.nextLine();
            bookService.addBook(title);
            i++;
        }
        bookService.displayAll();
        sc.close();
    }
}