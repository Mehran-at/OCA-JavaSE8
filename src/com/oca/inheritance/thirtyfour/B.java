package com.oca.inheritance.thirtyfour;

class B extends A {

    String compute(String str) {

        return super.compute(str.toLowerCase());
    }
}
