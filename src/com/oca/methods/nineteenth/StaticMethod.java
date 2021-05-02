package com.oca.methods.nineteenth;

class StaticMethod {

    static boolean isAvailable = false;

    public static void main(String[] args) {

        StaticMethod ts = new StaticMethod();
        System.out.println(isAvailable);
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }

    public static boolean doStuff() {

        return !isAvailable;
    }

}
//  B. All subclasses of the RuntimeException class are recoverable.
//  C. The parameter in a catch block is of Throwable type.
//  E. All subclasses of the Exception class except the RuntimeException class are checked exceptions.
