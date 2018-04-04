package com.bvan.oop.lesson10.java8;

import com.bvan.oop.lesson10.Movie;
import com.bvan.oop.lesson10.MoviesFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author bvanchuhov
 */
public class StreamApiExample2 {

    public static void main(String[] args) {
        List<Movie> movies = MoviesFactory.createMovies();

        // Imperative
        List<Movie> newMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getRating() > 8) {
                newMovies.add(movie);
            }
        }
        System.out.println(newMovies);

        // Declarative
        List<String> res = movies.stream()
                .filter(m -> m.getRating() > 8)
                .map(m -> m.getName())
                .skip(1)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
