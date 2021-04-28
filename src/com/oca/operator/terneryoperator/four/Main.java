package com.oca.operator.terneryoperator.four;

class Main {

    private static boolean isTrue = !true;

    public static void main(String[] args) {


        System.out.println(!isTrue ? args[0] : args[1]);
    }
}
//javac Main.java
//java Main AM PM
/*
    There is no compilation error. When Test class is loaded by JVM to invoked main(String []) method, static variable
    declaration and initialization statement is executed and false is assigned to flag as !true is false.

    As java Test AM PM command is used, so args[0] --> "AM" and args[1] --> "PM".

    In ternary operator, boolean expression is evaluated first, !flag evaluates to true and therefore agrs[0] is returned.

    AM is printed on to the console.
 */