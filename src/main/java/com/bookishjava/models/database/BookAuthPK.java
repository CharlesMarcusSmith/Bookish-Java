package com.bookishjava.models.database;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable // Makes it possible to be part of book Auth table
public class BookAuthPK{
    @Column(name = "author_id") // @Column(name... just allows us to specify the name of the column; this is the same for
    private int authorId;       // join column, but Spring can turn authorId to author_id itself anyway so this is
                                // uneccissary overkill.
    @ManyToOne // This notifies Spring that many book&author objects will be
    @JoinColumn(name = "book_id")   // This Join Column is the part that makes Spring aware its a foreign key a "book_id.
                                    // As this is a conjunction table we will have to do this for Author too on line 10
                                    // instead of @Column.
    private Book book;
    
    // This is just returning the primary key, not the related Author Entity object.
    // This is however unfinished as mentioned, I have left it in here to show how Spring is being used to magically
    // return the book object below.
    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    // Because it is aware the book_id related to book table,
    // it allows Spring to return a Book object (Book class functionality written already).
    public Book getBook() {
        return book;
    }
    // Same for setting a book as getting ^.
    public void setBook(Book book) {
        this.book = book;
    }
}
