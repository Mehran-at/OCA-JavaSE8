package com.oca.constructor.one;

class S {

    String name;
    int age;

    S() {

        this("Jenifer", 19);
        S("Jenifer", 19);
    }

/*  S() {

        S("Jenifer", 19);
    } */

    S(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void S(String name, int age) {

        this.name = name;
        this.age = age;
    }
}
/*
    A constructor can call another constructor in its class by using this(...) and can call constructor of superclass
     with super(...) and not the constructor name. In the above example we refer to a method that break the rules of
     clean coding and take the same name as constructor and class name which cause ambiguity. But it will be fine as
     long as there is a method with that name and this(...) which refers to the other overloaded constructor is at the
     first line of the constructor.

    Hence S("Jenifer", 19); causes compilation error.
 */
