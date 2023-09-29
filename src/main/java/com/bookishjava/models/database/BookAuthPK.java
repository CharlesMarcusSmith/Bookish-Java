package com.bookishjava.models.database;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable //Makes it part of book Auth table
public class BookAuthPK{
    @Column(name = "author_id")
    private int authorId;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
