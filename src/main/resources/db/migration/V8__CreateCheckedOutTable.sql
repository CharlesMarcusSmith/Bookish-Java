CREATE TABLE checked_out(
	id SERIAL PRIMARY KEY,
	copy_id INT REFERENCES "copy"(id),
	user_id INT REFERENCES "user"(id),
	checked_out_date DATE,
	due_date DATE
);