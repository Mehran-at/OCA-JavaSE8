package com.oca.exception.sixteenth;

import java.sql.SQLException;

class Test {

    private static void checkData() throws SQLException { // checked exception

        try {
            throw new SQLException();
        } catch (RuntimeException e) {
            e = null; //Line 10
            throw e; //Line 11
        } catch (Exception e) {
            e = null; //Line 10
//            throw e; //Line 11. java will no longer count this as a SQLException but a new checked exception, which its
//            method does not declare. And for that we get a compiler error
        }

    }

    public static void main(String[] args) {

        try {
            checkData(); //Line 17
        } catch (SQLException e) {
            System.out.println("NOT AVAILABLE"); // It will not print this message
        }
    }
}
/*
    Exception is a java class, so `e = null;` is a valid statement and compiles successfully.

    If you comment Line 10, and simply throw e, then code would compile successfully as compiler is certain that 'e'
    would refer to an instance of SQLException only.

    But the moment compiler finds `e = null;`, `throw e;` (Line 11) causes compilation error as at runtime 'e' may refer
    to any Exception type.

    NOTE: No issues with Line 17 as method checkData() declares to throw SQLException and main(String []) method code
    correctly handles it.
 */