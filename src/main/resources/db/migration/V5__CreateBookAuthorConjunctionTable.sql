CREATE TABLE book_auth (
    author_id INT REFERENCES author(id),
    book_id INT REFERENCES book(id)
);