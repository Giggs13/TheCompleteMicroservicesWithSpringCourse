package com.giggs13.cloud.controller;

import com.giggs13.cloud.model.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {

    @Value("${catalog.size}")
    private int size;

    @RequestMapping("/catalog")
    @CrossOrigin
    public List<Book> getCatalog() {
        return Book.getBooks().subList(0, size);
    }
}
