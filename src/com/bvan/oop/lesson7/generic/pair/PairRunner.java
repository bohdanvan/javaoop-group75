package com.bvan.oop.lesson7.generic.pair;

import java.util.List;

/**
 * @author bvanchuhov
 */
public class PairRunner {

    public static void main(String[] args) {
        Pair<String, Integer> personInfo =
                new Pair<>("Vlad", 25);

        Pair<Pair<Integer, String>, List<Integer>> x;

        List<String> l1;
        List<Integer> l2;
        List<List<Double>> l3;
    }
}
