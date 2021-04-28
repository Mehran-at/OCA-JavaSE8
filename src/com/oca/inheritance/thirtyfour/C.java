package com.oca.inheritance.thirtyfour;

class C extends B {

    String compute(String str) {

        return super.compute(str.replace('o', 'O')); //2nd argument is uppercase O
    }
}
