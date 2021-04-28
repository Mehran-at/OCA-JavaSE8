package com.oca.datatypesoperatorsvariables.twentynine.two;

import com.oca.datatypesoperatorsvariables.twentynine.one.Me;

public class You {

    public static void main(String[] args) {

        Me obj = new Me();
        System.out.println(obj.i1);
//        System.out.println(obj.i2);
//        System.out.println(obj.i3);
//        System.out.println(obj.i4);
    }
}
/*
    class A is declared public and defined in com.udayan.oca package, there is no problem in accessing class A outside
    com.udayan.oca package.

    class TestA is defined in com.udayan.oca.test package, to use class A either use import statement "import
    com.udayan.oca.A;" or fully qualified name of the class com.udayan.oca.A. No issues at Line 3 and LIne 7.

    As TestA is in different package so it can only access public members of class A using object reference. Line 8
    compiles successfully.

    protected, default and private members are not accessible outside com.udayan.oca package using object reference.

    NOTE: protected members can be accessed outside but only through inheritance and not object reference.
 */
