package com.bvan.oop.lesson4;

import java.time.LocalTime;

/**
 * @author bvanchuhov
 */
public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now(); // static factory method
        System.out.println(now);

        System.out.println(LocalTime.of(19, 0, 0));
    }
}
