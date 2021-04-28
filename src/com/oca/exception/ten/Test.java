package com.oca.exception.ten;

class Test {

    private static void m1() {

        System.out.println(1 / 0);
    }

    public static void main(String[] args) {

        try {
            m1();
        } finally {
            System.out.println("A"); /* it will print A before program terminates abruptly. Because main() Method doesn't
            handle ArithmeticException so it forwards it to JVM, but just before that finally block is executed. */
        }
    }
}