package com.bvan.oop.lesson6.enum_example.gender.good;

/**
 * @author bvanchuhov
 */
public class EnumCreation {

    public static void main(String[] args) {
        Gender g1 = Gender.MALE;

        // enum -> String
        String s = g1.name();

        // enum -> int
        int x = g1.ordinal();

        // String -> enum
        Gender g2 = Gender.valueOf("female".toUpperCase());
        System.out.println(g2);

        // int -> enum
        Gender[] values = Gender.values();
        Gender g3 = values[2];
        System.out.println(g3);

        System.out.println(g1.shortName());
    }
}
