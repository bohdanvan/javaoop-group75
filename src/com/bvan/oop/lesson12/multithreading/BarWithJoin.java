package com.bvan.oop.lesson12.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithJoin {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        Thread drinkerThread = new Thread(new Drinker(1));
        drinkerThread.start();

        try {
            drinkerThread.join(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadUtils.println("Bar is closed");
    }
}
