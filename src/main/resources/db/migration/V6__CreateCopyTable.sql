CREATE TABLE "copy" (
	id SERIAL PRIMARY KEY,
	book_id INT REFERENCES book(id)
);