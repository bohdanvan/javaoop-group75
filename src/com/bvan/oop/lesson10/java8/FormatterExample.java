package com.bvan.oop.lesson10.java8;

import com.bvan.oop.lesson10.Movie;
import com.bvan.oop.lesson7.generic.formatter.Formatter;

/**
 * @author bvanchuhov
 */
public class FormatterExample {

    public static void main(String[] args) {
        Formatter<Movie> f1 = m -> m.getName();
        Formatter<Movie> f2 = Movie::getName;

        Formatter<Movie> f3 = new Formatter<Movie>() {
            @Override
            public String format(Movie m) {
                return m.getName();
            }
        };
    }
}
