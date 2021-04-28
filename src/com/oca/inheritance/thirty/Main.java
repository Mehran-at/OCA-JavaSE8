package com.oca.inheritance.thirty;

class Main {

    public static void main(String[] args) {

        A cat = new B();
        A deer = new C();
        cat.jump(); // Animal
        deer.jump(); // Deer

        B cat2 = new B();
        cat2.jump(1);
    }
}
/*
    B class doesn't override the jump() method of Animal class, in fact jump(int) method is overloaded in B class.

    C class overrides jump() method of A class.

    Reference variable cat is of A type, cat.jump() syntax is fine and as B doesn't override jump() method hence
    A version is invoked, which prints Animal to the console.

    Even though reference variable deer is of A type but at runtime deer.jump(); invokes overriding method of Deer
    class, this prints Deer to the console.
 */