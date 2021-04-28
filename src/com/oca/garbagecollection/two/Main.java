package com.oca.garbagecollection.two;

class Main {

    public static void main(String[] args) {

        Pen p1 = new Pen(); //Line 1
        Pen p2 = new Pen(); //Line 2
        p1 = p2; //Line 3
        p1 = null; //Line 4
    }
}
/*
    At Line 3, p1 starts referring to the object referred by p2(Created at Line 2).

    So, after Line 3, object created at Line 1 becomes unreachable and thus eligible for Garbage Collection.
 */