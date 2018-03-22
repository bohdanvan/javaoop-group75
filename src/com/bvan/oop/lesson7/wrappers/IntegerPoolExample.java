package com.bvan.oop.lesson7.wrappers;

/**
 * @author bvanchuhov
 */
public class IntegerPoolExample {

    public static void main(String[] args) {
        Integer x1 = 127;
        Integer x2 = 127;

        Integer y1 = 128;
        Integer y2 = 128;

        System.out.println(x1 == x2); // true
        System.out.println(y1 == y2); // false
    }
}
