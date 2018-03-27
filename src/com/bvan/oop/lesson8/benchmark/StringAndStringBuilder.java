package com.bvan.oop.lesson8.benchmark;

/**
 * @author bvanchuhov
 */
public class StringAndStringBuilder {

    public static void main(String[] args) {
        String name = "Taras";
        int age = 25;

        String s = "Hello, I'm " + name + ", " + age + " years old";
        System.out.println(s);

        StringBuilder sb = new StringBuilder()
                .append("Hello, I'm ")
                .append(name)
                .append(", ")
                .append(age)
                .append(" year old");
        System.out.println(sb);

    }
}
