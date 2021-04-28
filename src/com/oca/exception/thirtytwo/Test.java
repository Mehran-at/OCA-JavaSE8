package com.oca.exception.thirtytwo;

class Test {

    public static void main(String[] args) {

        try { //outer
            try { //inner
                System.out.println(1 / 0);
            } catch (ArithmeticException e) {
                System.out.println("INNER"); // INNER
            } finally {
                System.out.println("FINALLY1"); // FINALLY1
            }
        } catch (ArithmeticException e) {
            System.out.println("OUTER");
        } finally {
            System.out.println("FINALLY2"); // FINALLY2
        }
    }
}
/*
    `System.out.println(1/0);` throws ArithmeticException, handler is available in inner catch-block, it executes and
    prints "INNER" to the console.

    Once an exception is handled, no other catch block will get executed unless the exception is re-thrown.

    Inner finally-block gets executed and prints "FINALLY1" to the console.

    Rule is finally-block always gets executed, so outer finally-block gets executed and prints "FINALLY2" to the
    console.
 */