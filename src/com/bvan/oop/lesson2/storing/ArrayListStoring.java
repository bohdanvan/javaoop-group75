package com.bvan.oop.lesson2.storing;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ArrayListStoring {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);

        ArrayList<Integer> b = a;
        b.add(30);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
