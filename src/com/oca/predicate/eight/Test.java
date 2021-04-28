package com.oca.predicate.eight;

import java.util.function.Predicate;

class Test {

    public static void main(String[] args) {

        printNumbers(i -> i % 2 != 0); // 13579
    }

    private static void printNumbers(Predicate<Integer> predicate) {

        for (int i = 1 ; i <= 10 ; i++) {
            if (predicate.test(i)) {
                System.out.print(i);
            }
        }
    }
}
/*
    In the boolean expression (predicate.test(i)): i is of primitive int type but auto-boxing feature converts it to
    Integer wrapper type.

    test(Integer) method of Predicate returns true if passed number is an odd number(1, 3, 5, 7, ), so given loop prints only odd
    numbers(0, 2, 4, 6). for loops works for the numbers from 1 to 10.
 */