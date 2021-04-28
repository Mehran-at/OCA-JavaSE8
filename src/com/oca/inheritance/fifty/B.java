package com.oca.inheritance.fifty;

class B implements A {

    public static void main(String[] args) {

        new B().fly(); // Flying at 20 degrees.
        new B().land(); // Landing at -20 degrees.
    }

    public void land() {

        System.out.println("Landing at " + -A.horizontalDegree() + " degrees."); //Line n3
    }
}
/*
    As per Java 8, default and static methods were added in the interface and default methods can invoke static method as
    well. Hence, there is no issue with the Flyable interface.

    class Aeroplane implements Flyable interface, hence it inherits the default method fly() and static method
    horizontalDegree() can be accessed using Flyable.horizontalDegree(). It also NEEDS the implementation of land()
    method. There is no issue with Aeroplane class as well.
 */