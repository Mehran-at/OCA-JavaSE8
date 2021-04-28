package com.oca.constructor.six;

class Test {

    public static void main(String[] args) {

        new B();
    }
}
/*
    Default constructor added by Java compiler in B class is:

    B() {
        super();
    }

    On executing new B(); statement, class B's default constructor is invoked, which invokes no-arg constructor of
    class A [super();].

    no-arg constructor of class A invokes parameterized constructor of class A [this(1);].

    Overloaded Constructor A is printed first and after that Constructor A is printed and then it goes back to th
    constructor of B class and prints Constructor B on to the console.
 */