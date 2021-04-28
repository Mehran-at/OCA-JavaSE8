package com.oca.constructor.ten.a;

public class A {

    //    Animal() {
    public A() { /* Constructor can take different access modifiers. As here A class is in package a, and B extends A.
        this constructor needs to be public, so B's constructor can access it via its super(); */

        System.out.print("A");
    }
}
