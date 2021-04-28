package com.oca.inheritance.fiftyseven;

class B extends A {

    static String getType() { //Line n2
        return "RULED";
    }

//    String getType() { /* Line n2 this override cause compilation error as instance methods can not override static methods. */
//        return "RULED";
//    }
}
