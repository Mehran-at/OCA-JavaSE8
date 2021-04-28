package com.oca.datatypesoperatorsvariables.thirtynine;

class Test {

    public static void main(String[] args) {

        P p1 = new P();
        p1.x = 100;
//        p1.y = 200;

        P p2 = new P();
        p2.x = 100;
//        p2.y = 200;

        System.out.println(p1);
        System.out.println(p2);
    }
}
/*
    Variable y is private so it cannot be accessed outside the boundary of Point class.

    p1.y and p2.y used inside Test class, cause the compilation error.
 */