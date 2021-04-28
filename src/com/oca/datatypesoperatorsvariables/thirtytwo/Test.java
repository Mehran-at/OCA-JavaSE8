package com.oca.datatypesoperatorsvariables.thirtytwo;

class Test {

    public static void main(String[] args) {

        m(1); // Number version
    }

    private static void m(Object obj) {

        System.out.println("Object version");
    }

    private static void m(Number obj) {

        System.out.println("Number version"); /* Compiler boxes i to Integer and as Number is the immediate super class
                                              of Integer so Number version refers to Integer object. */
    }

    private static void m(Double obj) { /* 1 is int literal, Java compiler can't implicit cast
                                        it to double and then box it to Double. */

        System.out.println("Double version");
    }
}
/*
    There are 3 overloaded method m. Note all the numeric wrapper classes (Byte, Short, Integer, Long, Float and Double)
     extend from Number and Number extends from Object.

    Compiler either does implicit casting or Wrapping but not both. 1 is int literal, Java compiler can't implicit cast
    it to double and then box it to Double rather it boxes i to Integer and as Number is the immediate super class of
    Integer so Number version refers to Integer object.

    Number version is printed on to the console.
 */