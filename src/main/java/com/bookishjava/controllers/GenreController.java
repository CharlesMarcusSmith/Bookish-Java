package com.bookishjava.controllers;

import java.util.List;
import com.bookishjava.models.database.Genre;
import com.bookishjava.repositories.GenreRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenreController {
    private final GenreRepository repository;
    GenreController(GenreRepository respository) {
        this.repository = respository;
    }

    @GetMapping("/genres")
    List<Genre> getGenres() {
        return repository.findAll();
    }
}
