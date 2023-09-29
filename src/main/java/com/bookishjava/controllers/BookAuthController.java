package com.bookishjava.controllers;

import com.bookishjava.models.database.BookAuth;
import com.bookishjava.repositories.BookAuthRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookAuthController {
    private final BookAuthRepository repository;
    BookAuthController(BookAuthRepository repository){
        this.repository = repository;
    }

    @GetMapping("/bookauths")
    List<BookAuth> getBookAuths(){
        return repository.findAll();
    }
}
