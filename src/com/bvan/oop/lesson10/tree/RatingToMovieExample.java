package com.bvan.oop.lesson10.tree;

import com.bvan.oop.lesson10.Movie;
import com.bvan.oop.lesson10.MoviesFactory;

import java.util.List;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class RatingToMovieExample {

    public static void main(String[] args) {
        NavigableMap<Double, Movie> ratingToMovie = new TreeMap<>();

        List<Movie> movies = MoviesFactory.createMovies();

        for (Movie movie : movies) {
            ratingToMovie.put(movie.getRating(), movie);
        }

        for (Movie movie : ratingToMovie.values()) {
            System.out.println(movie);
        }
        System.out.println();

        SortedMap<Double, Movie> myMovies = ratingToMovie.tailMap(7.8);
        for (Movie movie : myMovies.values()) {
            System.out.println(movie);
        }

        System.out.println(ratingToMovie.lastKey());
        System.out.println(ratingToMovie.firstKey());

        System.out.println(ratingToMovie.floorEntry(8.0));
        System.out.println(ratingToMovie.ceilingEntry(8.0));
    }
}
