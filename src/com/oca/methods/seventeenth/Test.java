package com.oca.methods.seventeenth;

class Test {

    public static void print() {

        System.out.println("static method");
    }

    public static void main(String[] args) {

        Test obj = null;
        obj.print();
    }
}
/*
    print() is static method of class Test. So correct syntax to call method print() is Test.print();

    but static methods can also be invoked using reference variable: obj.print(); Warning is displayed in this case.

    Even though obj has null value, we don't get NullPointerException as objects are not needed to call static methods.
 */