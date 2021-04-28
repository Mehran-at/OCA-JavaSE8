package com.oca.inheritance.thirtyseven;

interface A {

    double getPrice(); // public abstract

    default String symbol() {

        return "$";
    }
}