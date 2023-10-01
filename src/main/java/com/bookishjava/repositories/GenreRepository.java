package com.bookishjava.repositories;

import com.bookishjava.models.database.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
