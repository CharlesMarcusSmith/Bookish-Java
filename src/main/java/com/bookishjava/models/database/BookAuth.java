package com.bookishjava.models.database;

import jakarta.persistence.*;

@Entity
@Table(name = "book_auth")

public class BookAuth {
    @EmbeddedId
    private BookAuthPK id;
    public Author getAuthor() {
        return id.getAuthor();
    }

    public void setAuthor(Author author) {
        id.setAuthor(author);
    }

    public Book getBook() {
        return id.getBook();
    } // Return type is book as BookAuthPK

    public void setBook(Book book) {
        id.setBook(book);
    }
}
