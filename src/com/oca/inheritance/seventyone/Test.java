package com.oca.inheritance.seventyone;

class Test {

    public static void main(String[] args) {

        Animal animal = new Deer();
        ((Deer) animal).jump(); //Line n2. DEER JUMPS
        ((Deer) animal).jump(5); //Line n3. DEER JUMPS TO 5 FEET
        animal.jump();// DEER JUMPS
    }
}
/*
    Method jump() in Animal class declares to throw RuntimeException.

    Overriding method may or may not throw any RuntimeException. Only thing to remember is that if overridden method
    throws any unchecked exception or Error, then overriding method must not throw any checked exceptions. Line n1
    compiles successfully as it correctly overrides the jump() method of Animal class.

    Class Deer also provides overloaded jump(int) method.

    Inside main(String []) method, reference variable 'animal' is of Animal class (supertype) and it refers to an
    instance of Deer class (subtype), this is polymorphism and allowed in Java.

    As instance is of Deer class, hence 'animal' reference can easily be casted to Deer type. Line n2 and Line n3
    compiles successfully and on execution prints below on to the console:

    DEER JUMPS

    DEER JUMPS TO 5 FEET

    DEER JUMPS
 */