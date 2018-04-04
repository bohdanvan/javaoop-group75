package com.bvan.oop.lesson10;

import java.util.ArrayList;
import java.util.List;

import static com.bvan.oop.lesson10.Genre.*;
import static java.util.Arrays.asList;

/**
 * @author bvanchuhov
 */
public class MoviesFactory {

    public static List<Movie> createMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Pulp Fiction", 1994, asList(THRILLER, COMEDY, CRIME), 8.51));
        movies.add(new Movie("Her", 2013, asList(ROMANCE, DRAMA, SCI_FI), 7.754));
        movies.add(new Movie("Captain Fantastic", 2016, asList(DRAMA, ROMANCE, COMEDY), 7.86));
        movies.add(new Movie("The Matrix", 1999, asList(SCI_FI, ACTION), 8.3));
        movies.add(new Movie("Interstellar", 2014, asList(SCI_FI, DRAMA, ADVENTURE), 8.7));
        movies.add(new Movie("Mulholland Dr.", 2001, asList(THRILLER, DRAMA, DETECTIVE), 7.35));
        return movies;
    }
}

// Pulp Fiction;1994;THRILLER, COMEDY, CRIME
//Her;2013;ROMANCE, DRAMA, SCI_FI
//Captain Fantastic;2016;DRAMA, ROMANCE, COMEDY
//The Matrix;1999;SCI_FI, ACTION
//Interstellar;2014;SCI_FI, DRAMA, ADVENTURE
//Birdman or (The Unexpected Virtue of Ignorance);2014;DRAMA, COMEDY
//La vita è bella;1997;DRAMA, ROMANCE, COMEDY, WAR
//Sin City;2005;ACTION, THRILLER, CRIME, DETECTIVE
//Mulholland Dr.;2001;THRILLER, DRAMA, DETECTIVE
//Titanic;1997;DRAMA, ROMANCE
//Partly Cloudy;2009;ANIMATION, FANTASY, COMEDY, FAMILY
//Saw;2004;HORROR, DETECTIVE
