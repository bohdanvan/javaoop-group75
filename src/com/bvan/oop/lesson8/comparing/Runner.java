package com.bvan.oop.lesson8.comparing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Runner {

    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("A", "author Z", Genre.CLASSIC, 200));
        songs.add(new Song("C", "author Y", Genre.METAL, 300));
        songs.add(new Song("B", "author X", Genre.POP, 220));

        songs.sort(new AuthorComparator());

        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
