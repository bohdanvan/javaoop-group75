package com.bvan.oop.lesson8.comparing;

import java.util.Comparator;

/**
 * @author bvanchuhov
 */
public class AuthorComparator implements Comparator<Song> {
    @Override
    public int compare(Song a, Song b) {
        return a.getAuthor().compareTo(b.getAuthor());
    }
}
