package com.oca.datatypesoperatorsvariables.fiftytwo;

class Test {

    public static void main(String[] args) {

        String str = "ALASKA";
        System.out.println(str.charAt(str.indexOf("A") + 1));
    }
}
/*
    `int indexOf(String str)` method of String class returns the index within this string of the first occurrence of the
    specified substring. e.g. "Java".indexOf("a") returns 1.

    `char char(int index)` method of String class returns the char value at the specified index. e.g.
    "Java".charAt(2) returns 'v'.

    Let's check the given expression:

    str.charAt(str.indexOf("A") + 1)

    = "ALASKA".charAt("ALASKA".indexOf("A") + 1)

    = "ALASKA".charAt(0 + 1) //"ALASKA".indexOf("A") returns 0.

    = "ALASKA".charAt(1)

    = 'L'

    Hence, L is printed on to the console.
 */