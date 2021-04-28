package com.oca.constructor.eight;

class Test {

    public static void main(String[] args) {

        Study s = new Study();
        System.out.println(s.name + ":" + s.age);
        System.out.println(s);
    }
}
/*
    First find out the reason for compilation error, all the options are giving hint :)

    no-arg constructor of Student class calling another overloaded constructor by the name and this causes compilation
    error. This problem can be fixed in 2 ways:

    1st one: replace Study("James", 25); with this("James", 25) and then constructor refer to Study method which change
    name and age to Max 26.

    Method can have same name as the class name and constructor can call other methods but this not a good practice as
    cause confusion in more complex codes.
 */
