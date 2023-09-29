package com.bookishjava.repositories;

import com.bookishjava.models.database.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
