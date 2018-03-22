package com.bvan.oop.lesson7.wrappers;

/**
 * @author bvanchuhov
 */
public class NullIntegerSample {

    public static void main(String[] args) {
        Integer x = null;
        x++; // NullPointerException
        System.out.println(x);
    }
}
