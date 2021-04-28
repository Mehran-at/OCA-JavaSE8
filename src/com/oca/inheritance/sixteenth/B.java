package com.oca.inheritance.sixteenth;

class B extends A {

    private String breed;

    B(String breed) {

        super("name");
        this.breed = breed;
    }

    B(String name, String breed) {

        super(name);
        this.breed = breed;
    }

    public String getBreed() {

        return breed;
    }
}
/*
    abstract class can have constructors and it also possible to have abstract class without any abstract method. So,
    there is no issue with A class.

    Java compiler adds super(); as the first statement inside constructor, if call to another constructor using this(...)
    or super(...) is not available.

    Inside A class Constructor, compiler adds super(); => A(String name) { super(); this.name = name; },
    super() in this case invokes the no-arg constructor of Object class and hence no compilation error here.

    Compiler changes B(String) constructor to: B(String breed) { super(); this.breed = breed; }. No-arg constructor
    is not available in A class and as another constructor is provided, java compiler doesn't add default
    constructor. Hence B(String) constructor gives compilation error.

    There is no issue with B(String, String) constructor.
 */