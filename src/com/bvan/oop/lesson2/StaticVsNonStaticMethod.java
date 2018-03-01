package com.bvan.oop.lesson2;

import com.bvan.oop.lesson2.post.Post;

/**
 * @author bvanchuhov
 */
public class StaticVsNonStaticMethod {

    public static void main(String[] args) {
        double sin = Math.sin(10.0);

        Post post = new Post("A", "B");
        System.out.println(post.show());
    }
}
