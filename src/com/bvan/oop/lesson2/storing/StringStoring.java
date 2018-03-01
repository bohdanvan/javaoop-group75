package com.bvan.oop.lesson2.storing;

/**
 * @author bvanchuhov
 */
public class StringStoring {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;

        s2 = s2 + ", world";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
