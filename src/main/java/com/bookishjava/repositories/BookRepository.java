package com.bookishjava.repositories;

import com.bookishjava.models.database.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    //@Repository - tells spring that this class is used for data access, which is the component of our API that interacts with the database.
    //Essentially here we are passing in the @Entity in question and Primary Key data type into the
    //Spring repository exention; you can ctrl click intro JPARepository to investigate further.
}
