package com.oca.inheritance.eighteenth;

class B extends A {

    String type;
    String make;

    B(int capacity, String type) {
        /*INSERT-1*/
        super(capacity);
        this.type = type;
    }

    B(String make) {
        /*INSERT-2*/
        super(877);
        this.make = make;
    }
}
