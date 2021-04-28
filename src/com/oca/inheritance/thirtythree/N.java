package com.oca.inheritance.thirtythree;

class N extends M {

    public /* static */ void main(String[] args) {

        new M().main(args);//Line n3
    }
}
/*
    The static method of subclass N cannot hide the instance method of superclass M. static main(String []) method at Line
    n2 tries to hide the instance main(String []) method at Line n1 and hence Line n2 causes compilation error.

    There is no issue with Line n3 as it is a valid syntax to invoke the instance main(String []) method of M class.

    No issue with Line n4 as well as it correctly invokes static main(String []) method of N class.
 */