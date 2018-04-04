package com.bvan.oop.lesson10.java8;

import com.bvan.oop.lesson10.Movie;
import com.bvan.oop.lesson10.MoviesFactory;

import java.util.List;

/**
 * @author bvanchuhov
 */
public class StreamApiExample {

    public static void main(String[] args) {
        List<Movie> movies = MoviesFactory.createMovies();

        // Imperative
        for (Movie movie : movies) {
            if (movie.getReleaseYear() >= 2000 && movie.getRating() < 8.0) {
                String name = movie.getName();
                System.out.println(name);
            }
        }
        System.out.println();

        // Declarative
        movies.stream()
                .filter(m -> m.getReleaseYear() >= 2000)
                .filter(m -> m.getRating() < 8.0)
                .map(Movie::getName)
                .map(n -> n.length())
                .forEach(StreamApiExample::print);
    }

    private static void print(int x) {
        System.out.println(x);
    }
}
