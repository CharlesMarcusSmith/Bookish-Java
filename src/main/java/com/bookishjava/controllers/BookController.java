package com.bookishjava.controllers;

import java.util.List;
import com.bookishjava.models.database.Book;
import com.bookishjava.repositories.BookRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:5173")
@RestController // Telling Spring this is a RestController using the bean.
public class BookController {
    // Initiating and calling BookRepository method as 'repository', same as calling String stringName...
    private final BookRepository repository;
    // Setter for the repository variable.
    BookController(BookRepository repository){
        this.repository = repository;
    }

    @GetMapping("/books")
    List<Book> getBooks(){
        return repository.findAll();
    }
    // List as we are expecting multiple returns, if it was just one, then variable type would just be Book.
}
