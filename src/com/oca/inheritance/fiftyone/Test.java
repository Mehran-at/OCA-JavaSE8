package com.oca.inheritance.fiftyone;

class Test {

    public static void main(String[] args) {

        X obj = new Y(); //Line n1
        obj.A(); //Line n2
//        obj.B(); /*Line n3. Compiler error as there are no such method in X class to be override in X class. */
//        obj.C(); /*Line n4. Compiler error as there are no such method in X class to be override in X class. */

        ((Y) obj).B(); //Line n3
        ((Y) obj).C(); //Line n4


    }
}
/*
    Class Y correctly extends class X and it overrides method A() and provides two new methods B() and C().

    At Line n1, obj is of X type and therefore obj.B(); and obj.C(); cause compilation error as these methods are not
    defined in class X.
 */