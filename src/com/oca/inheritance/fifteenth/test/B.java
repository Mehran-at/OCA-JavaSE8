package com.oca.inheritance.fifteenth.test;

import com.oca.inheritance.fifteenth.A;

class B extends A {

    public static void main(String[] args) {

        new B().print();
    }

    public void print() {

        A obj = new A();
        System.out.println(obj.i1); // As variable is public, we can access it via object reference.
        System.out.println("Accessed in subclass using object reference not possible -> " /* + obj.i2 */);
        System.out.println("Accessed in subclass using inheritance -> " + i2);
        System.out.println(this.i1);
        System.out.println(this.i2);
        System.out.println(super.i2);
    }
}
/*
    Variable i1 is declared public in class A, so Line 8 doesn't cause any compilation error. Variable i2 is declared
    protected so it can only be accessed in subclass using inheritance but not using object reference variable. obj.i2
    causes compilation failure.

    class B inherits variable i2 from class A, so inside class B it can be accessed by using either this or super.
    Line 10 and Line 11 don't cause any compilation error.

    SO YOU CAN NOT REFERENCE PROTECTED VARIABLES VIA OBJECT REFERENCE, BUT INHERITANCE IN THEIR EXTENDED SUBCLASSES
 */
