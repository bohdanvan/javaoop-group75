package com.bvan.oop.lesson6.enum_example.gender.good;

/**
 * @author bvanchuhov
 */
public class UserRunner {

    public static void main(String[] args) {
        Gender gender = Gender.FEMALE;
        User user = new User("Vlad", 20, gender);

        String s = gender.name();
        System.out.println(s);
        System.out.println(gender.ordinal());
    }
}
