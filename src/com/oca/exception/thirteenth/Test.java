package com.oca.exception.thirteenth;

class Test {

    private static String s;

    public static void main(String[] args) {

        try {
            System.out.println(s.length());
        } catch (NullPointerException /*| RuntimeException */ ex) { /* NullPointerException extends RuntimeException and
        in multi-catch syntax we can't specify multiple Exceptions. related to each other in multilevel inheritance. */
            System.out.println("DONE");
        }
    }
}