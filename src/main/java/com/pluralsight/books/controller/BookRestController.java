package com.pluralsight.books.controller;

import com.pluralsight.books.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    @GetMapping("rest/book")
    public Book getBookByISBN13(@RequestParam(required = true) String isbn) {
        return null;
    }
}
