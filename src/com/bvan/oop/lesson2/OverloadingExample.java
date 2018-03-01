package com.bvan.oop.lesson2;

/**
 * @author bvanchuhov
 */
public class OverloadingExample {

    public static void main(String[] args) {
        int x = sum(10, 20);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String sum(String s1, String s2) {
        return s1 + s2;
    }
}
