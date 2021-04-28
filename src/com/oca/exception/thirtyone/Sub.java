package com.oca.exception.thirtyone;

import java.io.IOException;

class Sub extends Super {

    public void log() throws RuntimeException { //Only rule here is, as we override a method which throws Runtime
        // exception, we are not allowed to throw any checked exception

        System.out.println("Derived: log()");
    }

//    public void log() throws Error {
//
//        System.out.println("Derived: log()");
//    }

//    public void log() {
//
//        System.out.println("Derived: log()");
//    }

//    public void log() throws IOException {/* compilation error, can throws an checked exception. */
//
//        System.out.println("Derived: log()");
//    }
}
