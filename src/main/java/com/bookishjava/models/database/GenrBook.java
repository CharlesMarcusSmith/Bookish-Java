package com.bookishjava.models.database;

import jakarta.persistence.*;

@Entity
@Table(name = "genr_book")
public class GenrBook {
    @EmbeddedId
    private GenrBookPK id;

    public Book getBook() {
        return id.getBook();
    }

    public void setBook(Book book) {
        id.setBook(book);
    }

    public Genre getGenre() {
        return id.getGenre();
    }

    public void setGenre(Genre genre) {
        id.setGenre(genre);
    }
}
