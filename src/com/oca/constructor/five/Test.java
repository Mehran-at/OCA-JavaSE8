package com.oca.constructor.five;

class Test {

    String msg = null;

    public Test() {

    }

    public Test(String str) {

        msg = str;
    }

    public static void main(String[] args) {

        Test g1 = new Test();
        Test g2 = new Test("Good Evening!");
        g1.display();
        g1.display();
        g2.display();
        g2.display();
    }

    public void display() {

        System.out.println(msg);
    }
}
/*
    Test g1 = new Test(); invokes no-arg constructor. Property msg (of object referred by g1) is assigned
    to null.

    Test g2 = new Test("Good Evening!"); invokes parameterized constructor, which assigns "Good Evening!"
    to msg of object referred by g2.

    g1.display(); prints null

    Again we have same call g1.display(); which prints null.

    NOTE: We haven't called display() on object referred by g2.
 */