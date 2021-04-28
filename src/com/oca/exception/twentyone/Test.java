package com.oca.exception.twentyone;

import java.sql.SQLException;

class Test {

    private static void m() throws SQLException {

        try {
            throw new SQLException();
        } catch (Exception e) {
            throw e; /* Removing this line "CAUGHT SUCCESSFULLY" will not get executed as e is of SQLException type and
            redirect the flow of control back to main catch block which handle SQLException. */
        }
    }

    public static void main(String[] args) {

        try {
            m();
        } catch (SQLException e) {
            System.out.println("CAUGHT SUCCESSFULLY");
        }
    }
}
/*
    Even though it seems like method m() will not compile successfully, but starting with JDK 7, it is allowed to use
    super class reference variable in throw statement referring to sub class Exception object.

    In this case, method m() throws SQLException and compiler knows that variable e (Exception type) refers to an
    instance of SQLException only and hence allows it.

    Program executes successfully and prints CAUGHT SUCCESSFULLY on to the console.
 */