package com.springoauth2exemple.controller;

import com.springoauth2exemple.entity.Book;
import com.springoauth2exemple.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public List<Book> findAll() {
        return bookService.findAll();
    }
}
