CREATE TABLE genre_book(
book_id int REFERENCES book(id),
genre_id int REFERENCES genre(id)
);
