package com.oca.predicate.seven;

import java.util.function.Predicate;

class Main {

    public static void main(String[] args) {

        String[] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

        processStringArray(arr, p-> p.length() < 10);
        processStringArray(arr, p-> p.length() >= 1);
        processStringArray(arr, p-> !false);
        processStringArray(arr, p-> !!!!true);
        processStringArray(arr, p-> true);
    }

    private static void processStringArray(String[] arr, Predicate<String> predicate) {

        for (String str : arr) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
/*
    p -> true means test method returns true for the passed String.

    p -> !false means test method returns true for the passed String.

    p -> p.length() >= 1 means test method returns true if passed String's length is greater than or equal to 1 and
    this is true for all the array elements.

    p -> p.length() < 10 means test method returns true if passed String's length is less than 10 and this is true for
    all the array elements.
 */