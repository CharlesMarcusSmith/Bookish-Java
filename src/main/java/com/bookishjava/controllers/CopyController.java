package com.bookishjava.controllers;

import java.util.List;
import com.bookishjava.models.database.Copy;
import com.bookishjava.repositories.CopyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CopyController {
    private CopyRepository repository;
    CopyController(CopyRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/copies")
    List<Copy> getCopies() {
        return repository.findAll();
    }
}
