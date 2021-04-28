package com.oca.datatypesoperatorsvariables.fourtynine;

class Test {

    public static void main(String[] args) {

        String ab = "AB";
        String a = "A";
        String b = "B";
        a += b; // sides of + operator are not compile time constants. so a will be computed at runtime and create new object
        System.out.println(a == ab);

        a = "A" + "B";
        System.out.println(a == ab);

        final String A = "A";
        final String B = "B";
        a = A + B;
        System.out.println(a == ab);
    }
}
/*
    Please note that Strings computed by concatenation at compile time, will be referred by String Pool during execution.
    Compile time String concatenation happens when both of the operands are compile time constants, such as literal,
    final variable etc.

    Whereas, Strings computed by concatenation at run time (if the resultant expression is not constant expression) are
    newly created and therefore distinct.

    `a += b;` is same as `a = a + b;` and `a + b` is not a constant expression and hence is
    calculated at runtime and returns a non pool String object "AB", which is referred by variable 'A'.

    On the other hand, variable 'ab' refers to String Pool object "AB". As both the variables a
    and ab refer to different String objects, hence `a == ab` returns false.
 */