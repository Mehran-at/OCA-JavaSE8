package com.oca.datatypesoperatorsvariables.twentysix;

class Test {

    public static void main(String[] args) {

        System.out.println(new Boolean("ture"));
        System.out.println(new Boolean("TRue"));
        System.out.println(new Boolean(true));
    }
}
/*
    Boolean class code uses equalsIgnoreCase method to validate the passed String, so if passed String is "true"
    ('t', 'r', 'u' and 'e' can be in any case), then boolean value stored in Boolean object is true otherwise false.

    In this question passed String is "ture" and not "true" and that is why false is printed on to the console.
 */
