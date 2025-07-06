package com.library.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.library.service.BookService.displayAll(..))")
    public void logBeforeDisplay() {
        System.out.println("[LOG]: Display method execution started");
    }

    @After("execution(* com.library.service.BookService.displayAll(..))")
    public void logAfterDisplay() {
        System.out.println("[LOG]: Display method execution ended");
    }

    @Before("execution(* com.library.service.BookService.addBook(..))")
    public void logBeforeAddBook(){
        System.out.println("[LOG]: Saving method started");
    }

    @After("execution(* com.library.service.BookService.addBook(..))")
    public void logAfterAddBook(){
        System.out.println("[LOG]: Saving method ended");
    }
}