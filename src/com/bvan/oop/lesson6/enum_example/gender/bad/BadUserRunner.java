package com.bvan.oop.lesson6.enum_example.gender.bad;

/**
 * @author bvanchuhov
 */
public class BadUserRunner {

    public static void main(String[] args) {
        BadUser user = new BadUser("Vlad", 20, BadUser.MALE);
        String genderName = user.getGenderName();
        System.out.println(genderName);

    }
}
