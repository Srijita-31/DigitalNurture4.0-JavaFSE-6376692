package com.library;

import com.library.model.Book;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        System.out.println("[LibraryApp] Loading Spring context...");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many books do you want to add? ");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count; i++) {
            System.out.println("\nEnter details for book " + i + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();

            System.out.print("Author: ");
            String author = scanner.nextLine();

            Book book = new Book(title, author);
            bookService.addBook(book);
        }

        System.out.println("\nFinal Book List:");
        bookService.displayBooks();

        scanner.close();
    }
}
