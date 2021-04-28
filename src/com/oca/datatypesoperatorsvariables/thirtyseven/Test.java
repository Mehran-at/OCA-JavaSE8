package com.oca.datatypesoperatorsvariables.thirtyseven;

class Test {

    public static void main(String[] args) {

        S s = new S();
        System.out.println(s.name + s.height + s.result + s.age);
    }
}
/*
    name, height, result and age are instance variables of S class. And instance variables are initialized to their
    respective default values.

    name is initialized to null, age to 0, result to false and height to 0.0.

    Statement System.out.println(s.name + s.height + s.result + s.age); prints null0.0false0
 */