package com.bvan.oop.lesson2.post;

/**
 * @author bvanchuhov
 */
public class PostRunner {

    public static void main(String[] args) {
        Post elonPost = new Post("China’s progress", "elonmusk", 41);
        Post trumpPost = new Post("Unemployment", "realDonaldTrump", 20);
        Post bohdanPost = new Post("Kotlin...", "bohdan");

        elonPost.addComment("Cool!!!");

        elonPost.like();

        System.out.println(elonPost.show());

        bohdanPost.like();
        bohdanPost.like();
        bohdanPost.like();
        System.out.println(bohdanPost.show());

        System.out.println(elonPost.getLikes());
    }
}
