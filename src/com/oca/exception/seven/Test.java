package com.oca.exception.seven;

class Test {

    //    public static void main(String[] args) { /* main method must throw m1 checked exception or its superclasses as
//    it does not handle it. Pay attention, do not confuse this rule with, overriding interfaces methods which throws
//    checked exception*/
    public static void main(String[] args) throws Throwable {

        m1(); //Line 3
    }

    private static void m1() throws Exception { //Line 6

        System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
    }
}
/*
    If a method declares to throw Exception or its sub-type other than RuntimeException types, then calling method should
    follow handle or declare rule. In this case, as method m1() declares to throw Exception, so main method should either
    declare the same exception or its super type in its throws clause OR m1(); should be surrounded by try-catch block.
 */