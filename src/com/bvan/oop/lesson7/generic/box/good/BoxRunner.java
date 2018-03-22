package com.bvan.oop.lesson7.generic.box.good;

import com.bvan.oop.lesson7.generic.box.Cat;
import com.bvan.oop.lesson7.generic.box.Dog;

/**
 * @author bvanchuhov
 */
public class BoxRunner {

    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>(new Cat());
        Box<Dog> dogBox = new Box<>(new Dog());
        Box<String> nameBox = new Box<>("Vasya");
        Box<Integer> ageBox = new Box<>(20);

        Cat cat = catBox.get();

        sendBox(catBox);
    }

    private static void sendBox(Box<Cat> catBox) {
        Cat cat = catBox.get();
        cat.meow();
    }
}
