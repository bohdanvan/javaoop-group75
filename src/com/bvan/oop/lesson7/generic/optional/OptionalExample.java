package com.bvan.oop.lesson7.generic.optional;

import java.util.Optional;

/**
 * @author bvanchuhov
 */
public class OptionalExample {

    public static void main(String[] args) {
        Optional<Integer> age = Optional.of(50);
        Optional<Integer> age1 = Optional.empty();

        if (age.isPresent()) {
            Integer integer = age.get();
        }

        System.out.println(age1.isPresent());
    }
}
