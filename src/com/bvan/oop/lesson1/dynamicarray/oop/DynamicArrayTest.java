package com.bvan.oop.lesson1.dynamicarray.oop;

/**
 * @author bvanchuhov
 */
public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray da1 = new DynamicArray();
        da1.addLast(10);
        da1.addLast(20);
        System.out.println(da1.toString());

        DynamicArray da2 = new DynamicArray();
        da2.addLast(10);
        da2.addLast(20);
        da2.addLast(30);
        da2.addLast(40);
        da2.addLast(50);
        System.out.println(da2.toString());
    }
}
