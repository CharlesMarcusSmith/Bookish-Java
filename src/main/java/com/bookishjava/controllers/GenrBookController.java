package com.bookishjava.controllers;

import com.bookishjava.models.database.GenrBook;
import com.bookishjava.repositories.GenrBookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GenrBookController {
    private final GenrBookRepository repository;
    GenrBookController(GenrBookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/genrbooks")
    List<GenrBook> getGenrBooks() {
        return repository.findAll();
    }
}
