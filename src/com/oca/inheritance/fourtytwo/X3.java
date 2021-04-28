package com.oca.inheritance.fourtytwo;

interface X3 extends X2 {

    default void print() {

        System.out.println("X3");
    }
}