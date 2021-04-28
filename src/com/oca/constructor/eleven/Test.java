package com.oca.constructor.eleven;

class Test {

    public static void main(String[] args) {

        System.out.println(new SubClass());
    }
}
/*
    Constructors cannot use final, abstract or static modifiers. As no-argument constructor of SubClass uses final
    non-modifier, therefore it causes compilation error.
 */