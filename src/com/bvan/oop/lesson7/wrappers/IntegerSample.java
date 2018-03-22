package com.bvan.oop.lesson7.wrappers;

/**
 * @author bvanchuhov
 */
public class IntegerSample {

    public static void main(String[] args) {
        Integer x = 10; // Integer.valueOf(10);
        Integer y = 20; // Integer.valueOf(10);
        Integer z = x + y; // Integer.valueOf(x.intValue() + y.intValue());
        z++; // z = Integer.valueOf(z.intValue() + 1);

        System.out.println(z); // 31
    }
}
