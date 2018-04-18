package com.bvan.oop.lesson12.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithMultithreding {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        for (int drinkerId = 1; drinkerId <= 3; drinkerId++) {
            Runnable runnable = new Drinker(drinkerId);
            Thread thread = new Thread(runnable);
            thread.start();
        }

        ThreadUtils.println("Bar is closed");
    }
}

