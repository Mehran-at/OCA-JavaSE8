package com.oca.datatypesoperatorsvariables.fourtyfour;

class Test {

    private static void add(double d1, double d2) {

        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {

        System.out.println("Double version: " + (d1 + d2));
    }

    public static void main(String[] args) {

//        add(11.0, new Double(11.0));
        add(11, new Double(11.0));
//        add(11.0, new Double(11));
    }
}
/*
    add(10.0, new Double(10.0)); causes compilation error bcs it is an ambiguous call as compiler can't decide whether
    to convert 1st argument to Double reference type or 2nd argument to double primitive type.
 */