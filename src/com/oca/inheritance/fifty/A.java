package com.oca.inheritance.fifty;

interface A {

    static int horizontalDegree() { //Line n1
        return 20;
    }

    default void fly() {

        System.out.println("Flying at " + horizontalDegree() + " degrees."); //Line n2
    }

    void land();
}
