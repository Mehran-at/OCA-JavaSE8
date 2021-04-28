package com.oca.inheritance.fiftysix;

class A {

    int id = 1000; //Line n1

    A() {

        A(); //Line n2
    }

    void A() { //Line n3
        System.out.println(++id); //Line n4
    }
}