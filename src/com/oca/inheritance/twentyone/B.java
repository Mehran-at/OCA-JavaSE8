package com.oca.inheritance.twentyone;

class B extends A {

    public static void main(String[] args) {

        A a = new B();
        A a1 = new A();
//        B b = /*(B)*/ new A();
        B b = (B) new A();
        B b1 = new B();
    }
}
/*
    B b = new A(); -> child class reference cannot refer to parent class object. This will give compilation error.

    A a = new B(); -> parent class reference can refer to child class object. This is Polymorphism.

    B a = new B(); -> No issues at all.

    A a = new A(); -> No issues at all.
 */