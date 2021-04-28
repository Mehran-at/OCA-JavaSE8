package com.oca.datatypesoperatorsvariables.seventyeight;

class Test {

    public static void main(String[] args) {

        int i = 10;
        System.out.println(i > 3 != false); //  (i > 3) != false // true != false
    }
}
/*
    i > 3 != false

    It has 2 operators > and !=
    > has higher precedence over == and !=, so given expression can be written as:

    (i > 3) != false

    Let's solve above expression:

    true != false

    true

    Hence true is printed on to the console.
 */