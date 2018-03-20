package com.bvan.oop.lesson6.recursion;

/**
 * @author bvanchuhov
 */
public class Factorial {

    /**
     * n! = 1 * 2 * 3 * ... * n
     * 3! = 1 * 2 * 3 = 6
     * 4!
     *  = 4 * (3!)
     *  = 4 * (3 * (2!))
     *  = 4 * (3 * (2 * 1!))
     *  = 4 * (3 * (2 * 1))
     *  = 24
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative n: " + n);
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
