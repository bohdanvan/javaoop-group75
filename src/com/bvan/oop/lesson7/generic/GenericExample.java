package com.bvan.oop.lesson7.generic;

import com.bvan.oop.lesson2.post.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class GenericExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Vlad");
        names.add("Taras");
//        names.add(1);
//        names.add(new Post("A", "A"));

        String s = names.get(1);

        System.out.println(names);
    }
}
