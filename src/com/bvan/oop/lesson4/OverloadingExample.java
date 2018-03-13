package com.bvan.oop.lesson4;

/**
 * @author bvanchuhov
 */
public class OverloadingExample {

    public static void main(String[] args) {
        int sum = sum(10, 20);
        System.out.println(sum);
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
