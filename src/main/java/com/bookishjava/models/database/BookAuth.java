package com.bookishjava.models.database;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

import java.io.Serializable;

@Embeddable
@Table(name = "book_auth")
public class BookAuth implements Serializable {
    @Column(name="author_id")
    private int authorId;
    @Column(name="book_id")
    private int bookId;
}