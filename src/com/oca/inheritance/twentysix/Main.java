package com.oca.inheritance.twentysix;

class Main {

    public static void main(String[] args) {

        A obj = new B();
        obj.m1();
    }
}
/*
    NullPointerException extends RuntimeException, but there are no overriding rules related to unchecked exceptions.

    So, method m1() in Derived class correctly overrides Base class method.

    Rest is simple polymorphism. obj refers to an instance of Derived class and hence obj.m1(); invokes method m1() of
    Derived class, which prints "Derived: m1()" to the console.
 */