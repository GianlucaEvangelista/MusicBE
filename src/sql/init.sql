CREATE DATABASE musicDB;

CREATE TABLE songs
(
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    artist TEXT NOT NULL,
    genre TEXT NOT NULL,
    album TEXT NOT NULL,
    year TEXT NOT NULL
);
