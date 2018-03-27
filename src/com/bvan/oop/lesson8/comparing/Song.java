package com.bvan.oop.lesson8.comparing;

/**
 * @author bvanchuhov
 */
public class Song {

    private final String title;
    private final String author;
    private final Genre genre;
    private final int length;

    public Song(String title, String author, Genre genre, int length) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                ", length=" + length +
                '}';
    }
}
