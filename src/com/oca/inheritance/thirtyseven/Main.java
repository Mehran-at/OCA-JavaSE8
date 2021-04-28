package com.oca.inheritance.thirtyseven;

class Main {

    public static void main(String[] args) {

        A obj = new B(); //Line n1.
        System.out.println(obj.symbol() + obj.getPrice()); //Line n2. £35.0 since its double value it won't print £35
    }
}
/*
    default methods were added in Java 8. Class Chair correctly implements Sellable interface and it also overrides the
    default symbol() method of Sellable interface.

    At Line n1, 'obj' refers to an instance of Chair class, so obj.symbol() and obj.getPrice() invoke the overriding
    methods of Chair class only.

    obj.symbol() returns "£" and obj.getPrice() returns 35.0

    At Line n2, '+' operator behaves as concatenation operator and Line n2 prints £35.0 on to the console.
 */