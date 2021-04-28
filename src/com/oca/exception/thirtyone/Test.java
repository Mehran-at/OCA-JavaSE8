package com.oca.exception.thirtyone;

class Test {

    public static void main(String[] args) {

        Super obj = new Sub();
        obj.log(); // Derived: log()
    }
}
/*
    NullPointerException extends RuntimeException. Overriding method may or may not throw any RuntimeException. Only
    thing to remember is that if overridden method throws any unchecked exception or Error, then overriding method must
    not throw any checked exceptions.
 */