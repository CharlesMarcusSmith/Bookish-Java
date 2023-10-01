package com.bookishjava.repositories;

import com.bookishjava.models.database.GenrBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenrBookRepository extends JpaRepository<GenrBook, Long> {

}
