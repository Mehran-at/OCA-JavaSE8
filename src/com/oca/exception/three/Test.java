package com.oca.exception.three;

import java.io.IOException;

class Test {

    public static void main(String[] args) {

        try {
            method1();
        } catch (MyException ne) {
            System.out.println("A");
        }
    }

    private static void method1() /* or we can declare Exception here */ {

        try {
            throw 3 > 10 ? new MyException() : new IOException();/* Here we might throw an checked exception, and check
                                                                   exceptions need to be either declared or handled. */
        } catch (IOException ie) {
            System.out.println("I");
        } catch (Exception ie) { // Here we handle that checked exception throw possibility
            System.out.println("B");
        }
    }
}
