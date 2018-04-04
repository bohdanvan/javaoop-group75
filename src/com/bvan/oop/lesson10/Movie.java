package com.bvan.oop.lesson10;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author bvanchuhov
 */
public final class Movie {

    private final String name;
    private final int releaseYear;
    private final Set<Genre> genres;
    private final double rating;

    public Movie(String name, int releaseYear, Collection<Genre> genres, double rating) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.genres = new TreeSet<>(genres);
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", genres=" + genres +
                ", rating=" + rating +
                '}';
    }
}
