package com.bvan.oop.lesson6.exception.unchecked.factorial;

import java.math.BigInteger;

/**
 * @author bvanchuhov
 */
public class FactorialRunner {

    public static void main(String[] args) {
        try {
            BigInteger factorial = Factorial.factorial(-10);
            System.out.println(factorial);
        } catch (IllegalStateException e) {
            System.out.println("State Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Argument Error: " + e.getMessage());
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Goodbye");
    }
}
