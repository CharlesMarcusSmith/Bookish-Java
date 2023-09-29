package com.bookishjava.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookishjava.models.database.Author;
import com.bookishjava.repositories.AuthorRepository;



@RestController
public class AuthorController {
    private final AuthorRepository repository;

    AuthorController(AuthorRepository repository){
        this.repository = repository;
    }

    @GetMapping("/authors")
    List<Author> getAuthors(){
        return repository.findAll();
    }
}
