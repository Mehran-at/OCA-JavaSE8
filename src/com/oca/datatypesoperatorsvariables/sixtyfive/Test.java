package com.oca.datatypesoperatorsvariables.sixtyfive;

class Test {

    public static void main(String[] args) {

        byte b = 10; //Line n4
        new Car().speed(b); //Line n5 DARK
    }
}
/*
    speed method is correctly overloaded in Car class as both the methods have different signature: speed(Byte) and
    speed(byte...). Please note that there is no rule regarding return type for overloaded methods, return type can be
    same or different.

    `new Car().speed(b);` tags to speed(Byte) as boxing is preferred over variable arguments. Code as is prints DARK on
    to the console.

    Variable arguments syntax '...' can be used only for method parameters and not for variable type and type-casting.
    Hence the option of replacing Line n4 and Line n5 are not correct.

    If you delete speed(Byte) method, i.e. Line n1, Line n2 and Line n3, then `new Car().speed(b);` would tag to
    speed(byte...) method and on execution would print LIGHT on to the console.
 */