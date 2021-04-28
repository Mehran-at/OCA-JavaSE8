package com.oca.datatypesoperatorsvariables.sixtythree;

class Test {

    private static void m(int i) {

        System.out.print(1);
    }

    private static void m(int i1, int i2) {

        System.out.print(2);
    }

    private static void m(char... args) {

        System.out.print(3);
    }

    public static void main(String... args) {

        m('A');
        m('A', 'B');
        m('A', 'B', 'C');
        m('A', 'B', 'C', 'D');
    }
}
/*
    If choice is between implicit casting and variable arguments, then implicit casting takes precedence because
    variable arguments syntax was added in Java 5 version.

    m('A'); is tagged to m(int) as 'A' is char literal and implicitly casted to int.

    m('A', 'B'); is tagged to m(int, int) as 'A' and 'B' are char literals and implicitly casted to int.

    m('A', 'B', 'C'); is tagged to m(char...)

    m('A', 'B', 'C', 'D'); is tagged to m(char...)

    There is no compilation error and on execution output is: 1233
 */