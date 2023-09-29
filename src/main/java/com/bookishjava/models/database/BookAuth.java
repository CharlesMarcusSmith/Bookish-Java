package com.bookishjava.models.database;

import jakarta.persistence.*;

@Entity
@Table(name = "book_auth")  // This @Table(name... is just used to ensure Spring knows what the table name is
                            // This is unnecessary overkill, Spring would get 'book_auth' from BookAuth magically itself.
public class BookAuth {
    @EmbeddedId // Tells us to make a Primary Key from two Foreign Keys
    private BookAuthPK id; // Class / object we made to create Primary Key from the two Foreign Keys

    //Getter and setters: These are retrieved from the table in the Book

    // See BookAuthPK for notes about this (it's unfinished):
    public int getAuthorId() {
        return id.getAuthorId();
    }
    // See BookAuthPK for notes about this (its unfinished):
    public void setAuthorId(int authorId) {
        id.setAuthorId(authorId);
    }

    public Book getBook() {
        return id.getBook();
    } // Return type is book as BookAuthPK

    public void setBook(Book book) {
        id.setBook(book);
    }
}
