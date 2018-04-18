package com.bvan.oop.lesson12.multithreading;

/**
 * @author bvanchuhov
 */
public class ThreadUtils {

    private ThreadUtils() {}

    public static void println(Object msg) {
        Thread currentThread = Thread.currentThread();
        System.out.println(String.format("%-20s: %s", currentThread.getName(), msg));
    }
}
