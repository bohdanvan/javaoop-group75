package com.bvan.oop.lesson6.object;

/**
 * @author bvanchuhov
 */
public class ObjectExample {

    public static void main(final String[] args) {
        User u1 = new User("Taras");
        User u2 = new User("Taras");
        u1.sayHello();
        System.out.println(u1.toString());

        System.out.println(u1 == u2);
        System.out.println(u1.equals("Hello"));

        Object o1 = "Hello";
        Object o2 = new User("Vlad");
    }
}
