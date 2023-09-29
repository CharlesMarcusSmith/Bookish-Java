package com.bookishjava.models.database;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "book_auth")
public class BookAuth {
    @EmbeddedId //Tells us to make a Primary Key from two Foreign Keys
    private BookAuthPK id;


    public int getAuthorId() {
        return id.getAuthorId();
    }

    public void setAuthorId(int authorId) {
        id.setAuthorId(authorId);
    }

    public Book getBook() {
        return id.getBook();
    }

    public void setBook(Book book) {
        id.setBook(book);
    }
}
