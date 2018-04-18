package com.bvan.oop.lesson12.multithreading;

/**
 * @author bvanchuhov
 */
public class CurrentThreadExample {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadUtils.println("2");
            }
        }).start();

        ThreadUtils.println("1");
    }
}
