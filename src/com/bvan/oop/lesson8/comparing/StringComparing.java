package com.bvan.oop.lesson8.comparing;

/**
 * @author bvanchuhov
 */
public class StringComparing {

    public static void main(String[] args) {
        System.out.println("ABCD".compareTo("EFG")); // < 0
        System.out.println("ABCD".compareTo("ABCD")); // 0
        System.out.println("Hometown".compareTo("Homework")); // < 0
        System.out.println("A".compareTo("a")); // < 0
        System.out.println("Home".compareTo("Homework")); // < 0
    }
}
