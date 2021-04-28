package com.oca.inheritance.fourtyfive.one;

class Test {

    public static void main(String[] args) {

        A a = new C();
        a.move();

        B b = new C();
        b.move();

        C c = new C();
        c.move();

        B b1 = null;
        b1.move();
    }
}
/*
    Method move() declared in Moveable interface is implicitly public and abstract.

    Abstract class Animal has non-abstract method move() and it is declared with no modifier (package scope). Abstract
    class in java can have 0 or more abstract methods. Hence Animal class compiles successfully.

    class Dog extends Animal and as both the classes Animal and Dog are within the same package 'com.udayankhattry.oca',
    Dog inherits the move() method defined in Animal class.

    Dog class implements Moveable interface as well, therefore it must implement public move() method as well. But as
    inherited move() method from Animal class is not public, therefore Dog class fails to compile.
 */