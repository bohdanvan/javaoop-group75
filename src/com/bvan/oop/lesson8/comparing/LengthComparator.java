package com.bvan.oop.lesson8.comparing;

import java.util.Comparator;

/**
 * @author bvanchuhov
 */
public class LengthComparator implements Comparator<Song> {
    @Override
    public int compare(Song a, Song b) {
        return Integer.compare(a.getLength(), b.getLength());
    }
}
