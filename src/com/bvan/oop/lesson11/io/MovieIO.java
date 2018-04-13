package com.bvan.oop.lesson11.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class MovieIO {

    public static void main(String[] args) {
        String inFileName = "files/movies.csv";
        String outFileName = "files/movies-out.csv";
        String binFileName = "files/movies.dat";

        try {
//            serializeTest(inFileName, binFileName);
            deserializeTest(binFileName);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file is not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Sorry, IO error: " + e.getMessage());
        } catch (IllegalFormatException e) {
            System.out.println("Sorry, illegal format: " + e.getMessage());
        }
    }

    private static void serializeTest(String inFileName, String binFileName) throws IOException {
        List<Movie> movies = readMoviesFromFile(inFileName);
        writeMoviesIntoBinFile(movies, binFileName);
    }

    private static void deserializeTest(String binFileName) throws IOException {
        List<Movie> movies = readMoviesFromBinFile(binFileName);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    private static void writeMoviesIntoBinFile(
            List<Movie> movies,
            String fileName) throws IOException {
        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(movies);
        }
    }

    private static List<Movie> readMoviesFromBinFile(String fileName) throws IOException {
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream(fileName))) {
            return (List<Movie>)inputStream.readObject();
        } catch (ClassNotFoundException | ClassCastException e) {
            throw new IllegalFormatException("can't read movies from file " + fileName, e);
        }
    }

    private static void writeMoviesIntoFile(
            List<Movie> movies,
            String fileName) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(fileName, true))) {
            for (Movie movie : movies) {
                String s = movie.getTitle() + "|" + movie.getReleaseYear();
                writer.write(s);
                writer.newLine();
            }
        }
    }

    /**
     * @throws IOException
     * @throws FileNotFoundException
     * @throws IllegalFormatException
     */
    private static List<Movie> readMoviesFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileName))) {
            List<Movie> movies = new ArrayList<>();

            String line;
            while ((line = reader.readLine()) != null) {
                Movie movie = parseMovie(line);
                movies.add(movie);
            }
            return movies;
        }
    }

    /**
     * @throws IOException
     * @throws FileNotFoundException
     * @throws IllegalFormatException
     */
    private static Movie readMovieFromFile(String fileName) throws IOException {
        // try-with-resources
        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileName))) {
            return parseMovie(reader.readLine());
        }
    }

    /**
     * @throws IOException
     * @throws FileNotFoundException
     * @throws IllegalFormatException
     */
    private static Movie readMovieFromFileOld(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String s = reader.readLine();
            return parseMovie(s);
        } finally {
            closeReader(reader);
        }
    }

    private static void closeReader(BufferedReader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @throws IllegalFormatException
     */
    private static Movie parseMovie(String s) {
        String[] token = s.split(";");
        if (token.length < 2) {
            throw new IllegalFormatException("should be <title>;<releaseYear>: " + s);
        }
        String title = token[0];
        if (!isInt(token[1])) {
            throw new IllegalFormatException("illegal release year: " + s);
        }
        int releaseYear = Integer.parseInt(token[1]);
        return new Movie(title, releaseYear);
    }

    private static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
