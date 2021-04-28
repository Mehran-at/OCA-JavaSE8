package com.oca.classdefinition.five;

abstract class Toy {

    int price; // default access modifier for abstract class variables is package-private(default))

    public static void insertToy() {/* code goes here */} // Abstract classes can have non abstract methods


    public int calculatePrice() {return price;} // Abstract classes can have non abstract methods

    public abstract int computeDiscount(); // Abstract methods in abstract classes cannot have a body
}
