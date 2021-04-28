package com.oca.inheritance.twentyfour;

import java.io.FileNotFoundException;
import java.io.IOException;

class Test implements I {

//    @Override
//    public void m1() throws IOException { // works fine
//
//    }

    @Override
    public void m1() throws FileNotFoundException {

    }


//    @Override
//    public void m1()  {
//
//    }
}
/*
    According to overriding rules, if super class / interface method declares to throw a checked exception, then
    overriding method of sub class / implementer class has following options:

    1. May not declare to throw any checked exception,

    2. May declare to throw the same checked exception thrown by super class / interface method,

    3. May declare to throw the sub class of the exception thrown by super class / interface method,

    4. Cannot declare to throw the super class of the exception thrown by super class / interface method
 */