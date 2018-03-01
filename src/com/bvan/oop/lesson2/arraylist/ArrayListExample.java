package com.bvan.oop.lesson2.arraylist;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        int[] elems = new int[5];
        elems[1] = 10;
        System.out.println(elems[1]);
        System.out.println(elems.length);

        ArrayList<String> names = new ArrayList<>();
        names.add("Taras");
        names.add("Ivan");
        System.out.println(names);

//        ArrayList<int>
        ArrayList<Integer> ages = new ArrayList<>();
        for (int age = 1; age <= 120; age++) {
            ages.add(age);
        }
        System.out.println(ages);
    }
}
