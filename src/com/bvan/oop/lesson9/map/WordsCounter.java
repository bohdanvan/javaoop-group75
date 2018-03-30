package com.bvan.oop.lesson9.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bvanchuhov
 */
public class WordsCounter {

    public static void main(String[] args) {
        List<String> langs = langs();

        Map<String, Integer> wordToCount = countWords(langs);
        System.out.println(wordToCount);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordToCount.entrySet());
        entries.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o1.getValue(), o2.getValue());
            }
        }.reversed());
        System.out.println(entries);
    }

    public static List<String> langs() {
        return Arrays.asList(
                "Java",
                "Kotlin",
                "Java",
                "Java",
                "C#",
                "Kotlin",
                "Kotlin",
                "Java",
                "Kotlin",
                "Kotlin",
                "C#",
                "C#",
                "Java",
                "C#",
                "JavaScript",
                "C++",
                "JavaScript",
                "Java",
                "JavaScript",
                "C++",
                "C++",
                "C++",
                "Haskell",
                "Haskell",
                "C++",
                "Haskell",
                "Haskell"
        );
    }

    public static Map<String, Integer> countWords(
            List<String> words) {

        Map<String, Integer> wordToCount = new LinkedHashMap<>();
        for (String word : words) {
            if (wordToCount.containsKey(word)) {
                Integer count = wordToCount.get(word);
                wordToCount.put(word, count + 1);
            } else {
                wordToCount.put(word, 1);
            }
        }
        return wordToCount;
    }
}
