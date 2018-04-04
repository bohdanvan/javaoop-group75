package com.bvan.oop.lesson10.java8;

import com.bvan.oop.lesson10.Movie;

import java.util.function.BiFunction;
import java.util.function.Function;

import static com.bvan.oop.lesson10.Genre.COMEDY;
import static com.bvan.oop.lesson10.Genre.CRIME;
import static com.bvan.oop.lesson10.Genre.THRILLER;
import static java.util.Arrays.asList;

/**
 * @author bvanchuhov
 */
public class LambdaExample {

    public static void main(String[] args) {
        Movie movie = new Movie("Pulp Fiction", 1994, asList(THRILLER, COMEDY, CRIME), 8.51);

        Function<Movie, String> nameFunction = m -> m.getName();
        BiFunction<Movie, Integer, Character> pipets =
                (m, i) -> m.getName().charAt(i);

        String name = nameFunction.apply(movie);
        System.out.println(name);

        Character c = pipets.apply(movie, 2);
        System.out.println(c);
    }
}
