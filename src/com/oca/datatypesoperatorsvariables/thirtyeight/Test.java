package com.oca.datatypesoperatorsvariables.thirtyeight;

class Test {

    public static void main(String[] args) {

        final int i1 = 1;
        final Integer i2 = 1; /* Although final, but i2 is not compile time constant as it's not of final primitive
        types or String literal. */
        final String s1 = ":ONE";

        String str1 = i1 + s1;
        String str2 = i2 + s1;

        System.out.println(str1 == "1:ONE"); // true
        System.out.println(str2 == "1:ONE"); // false

        double d1 = 2.0; /* Although primitive type, but d1 is not compile time constant as it's not final or String
        literal. */
        final String d2 = "2.0";
        String dr1 = d1 + d2;

        System.out.println(dr1 == "2.02.0"); // false

        String c1 = "2.0"; /* Although String type, but c1 is not compile time constant as it's not final or String
        literal. */
        final String c2 = "2.0";
        String cr1 = c1 + c2;

        System.out.println(cr1 == "2.02.0"); // false

        final float f1 = 2.0f; /* Here we have a real compile time constant, as it's final and primitive type. */
        final String f2 = "2.0"; /* Another compile time constant, as it's final and from String type. */
        String fr1 = f1 + f2;

        System.out.println(fr1 == "2.02.0"); // true
    }
}
/*
    Please note that Strings computed by concatenation at compile time, will be referred by String Pool during execution.
    Compile time String concatenation happens when both of the operands are compile time constants, such as literal,
    final variable etc.

    Whereas, Strings computed by concatenation at run time (if the resultant expression is not constant expression) are
    newly created and therefore distinct.

    For the statement, String str1 = i1 + s1;, i1 is a final variable of int type and s1 is a final variable of String
    type. Hence, `i1 + s1` is a constant expression which is computed at compile-time and results in String
    literal "1:ONE".

    This means during compilation, Java compiler already has translated the statement:

        String str1 = i1 + s1;

    to

        String str1 = "1:ONE";

    As "1:ONE" is a String literal, hence at runtime it will be referred by String Pool.

    On the other hand, for the statement, String str2 = i2 + s1;, `i2 + s1` is not a constant expression because i2 is
    neither of primitive type nor of String type, hence it is computed at run-time and returns a non-pool String
    object "1:ONE".

    As, str1 refers to String Pool object "1:ONE", hence `str1 == "1:ONE"` returns true, whereas str2 refers to non-Pool
    String object "1:ONE" and hence `str2 == "1:ONE"` returns false.
 */