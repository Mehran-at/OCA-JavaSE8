package com.oca.predicate.eleven;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Test {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("A");
        words.add("an");
        words.add("the");
        words.add("when");
        words.add("what");
        words.add("Where");
        words.add("whether");

        processStringArray(words, p -> !!!!true);
        processStringArray(words, (String p) -> p.length() < 100);
        processStringArray(words, p -> true);
    }

    private static void processStringArray(List<String> list, Predicate<String> predicate) {

        for (String str : list) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}