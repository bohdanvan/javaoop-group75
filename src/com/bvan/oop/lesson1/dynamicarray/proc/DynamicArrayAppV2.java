package com.bvan.oop.lesson1.dynamicarray.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class DynamicArrayAppV2 {

    public static void main(String[] args) {
        int[] elems = readClientElemsFromConsole();

        System.out.println(Arrays.toString(elems));
    }

    public static int[] readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        int size = 0;
        int[] elems = new int[4];

        int n = readClientElem(scanner);
        while (n != 0) {
            if (size == elems.length) {
                elems = Arrays.copyOf(elems, elems.length * 2);
            }
            elems[size] = n;
            size++;

            n = readClientElem(scanner);
        }
        return Arrays.copyOf(elems, size);
    }

    public static int readClientElem(Scanner scanner) {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // skip

            System.out.println("Illegal input");
            System.out.print(">> ");
        }
        return scanner.nextInt();
    }

    public static int[] addLastElem(int[] elems, int n) {
        int[] newElems = new int[elems.length + 1];
        for (int i = 0; i < elems.length; i++) {
            newElems[i] = elems[i];
        }
        newElems[newElems.length - 1] = n;
        elems = newElems;
        return elems;
    }
}
