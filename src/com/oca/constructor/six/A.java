package com.oca.constructor.six;

class A {

    A() {

        this(1);
        System.out.println("Constructor A");
    }

    A(int i) {

        System.out.println("Overloaded Constructor A");
    }
}
