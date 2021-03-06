package com.oca.exception.nineteenth;

import java.sql.SQLException;

class Test {

    public static void main(String[] args) {

        try {
            A obj = new B(); //Line n1
            obj.multiply(1, 2, 3);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
//  Which of the options can be used to replace /*INSERT*/ in B class such that there is no compilation error?
/*
    At Line n1, reference variable 'obj' is of A type (supertype) and it refers to an instance of B
    class (subtype). This is polymorphism and allowed in Java.

    multiply(int...) method declared in A interface declares to throw SQLException, hence the catch handler
    for Line n1 should provide handler for SQLException or its supertype. As catch-handler for SQLException is available,
    therefore Test class compiles successfully.

    According to overriding rules, if super class / interface method declares to throw a checked exception, then
    overriding method of sub class / implementer class has following options:

        1. May not declare to throw any checked exception

        2. May declare to throw the same checked exception thrown by super class / interface method: SQLException is a
        valid option.

        3. May declare to throw the sub class of the exception thrown by super class / interface method: SQLWarning is a
        valid option.

        4. Cannot declare to throw the super class of the exception thrown by super class / interface method: Exception,
        Throwable are not valid options.

        5. Cannot declare to throw unrelated checked exception: java.io.IOException is not a valid option as it is not
        related java.sql.SQLException in multi-level inheritance.

        6. May declare to throw any RuntimeException or Error: RuntimeException, NullPointerException and Error are valid
        options.


    Therefore 5 options can successfully replace INSERT: SQLException, SQLWarning, RuntimeException, Error and
    NullPointerException
 */