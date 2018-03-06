package com.bvan.oop.lesson2.post;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Post {

    // field
    private final String content;
    private final String author;
    private int likes;
    private final ArrayList<String> comments = new ArrayList<>();

    // constructor
    public Post(String content, String author, int likes) {
        checkLikes(likes);

        this.content = content;
        this.author = author;
        this.likes = likes;
    }

    private void checkLikes(int likes) {
        if (likes < 0) {
            throw new IllegalArgumentException("negative likes: " + likes);
        }
    }

    public Post(String content, String author) {
        this(content, author, 0);
    }

    // methods (interface + implementation)

    public void like() {
        likes++;
    }

//    // Immutable implementation
//    public Post like() {
//        return new Post(this.content, this.author, this.likes + 1);
//    }

    public String show() {
        return "\"" + content + "\" by " + author + ", "
                + likes + " likes, " + comments.size() + " comments";
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", likes=" + likes +
                ", comments=" + comments +
                '}';
    }
}
