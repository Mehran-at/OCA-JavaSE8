package com.oca.constructor.ten.c;

import com.oca.constructor.ten.b.B;

public class Test {

    public static void main(String[] args) {

        new B();
    }
}
/*
    super(); is added by the compiler as the first statement in both the constructors:

    A() {

        super();

        System.out.print("ANIMAL-");

    }

    and

    public B() {

        super();

        System.out.print("B");

    }

    Class A extends from Object class and Object class has no-argument constructor, hence no issues with the
    constructor of Animal class.

    A class's constructor has package scope, which means it is accessible to all the classes declared in package
    'a'. But Dog class is declared in package 'b' and hence `super();` statement inside B class's constructor causes
    compilation error as no-argument constructor of A class is not visible.

    There is no compilation error in Test.java file as B class's constructor is public and therefore `new B();`
    compiles successfully.
 */