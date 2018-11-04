DROP TABLE singer IF EXISTS;

CREATE TABLE singer  (
	singer_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
	first_name VARCHAR(20),
	last_name VARCHAR(20),
	song VARCHAR(100)
);
