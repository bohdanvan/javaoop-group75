package com.bvan.oop.lesson7.generic.box.bad;

import com.bvan.oop.lesson7.generic.box.Cat;
import com.bvan.oop.lesson7.generic.box.Dog;

/**
 * @author bvanchuhov
 */
public class ObjectBoxRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        ObjectBox catBox = new ObjectBox(dog);

        sendBox(catBox);
    }

    private static void sendBox(ObjectBox catBox) {
        Object o = catBox.get();
        if (o instanceof Cat) {
            Cat cat = (Cat) o; // BAD PRACTICE
            cat.meow();
        } else {
            throw new IllegalArgumentException("where is my cat?");
        }
    }
}

