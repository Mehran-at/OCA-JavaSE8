package com.oca.inheritance.sixtysix;

class Test {

    public static void main(String[] args) {

        new Sub();
    }
}
/*
    Parent (Super) class constructor is invoked by `super();` (all letters in lowercase) from within the constructor
    of subclass.

    First statement inside no-argument constructor of Sub class is: `Super();` (Letter 'S' is in uppercase) and hence
    it causes compilation error.
 */