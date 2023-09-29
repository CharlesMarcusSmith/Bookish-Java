package com.bookishjava.repositories;

import com.bookishjava.models.database.BookAuth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAuthRepository extends JpaRepository<BookAuth, Long> {
}
