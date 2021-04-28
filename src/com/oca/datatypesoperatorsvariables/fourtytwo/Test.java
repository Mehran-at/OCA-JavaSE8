package com.oca.datatypesoperatorsvariables.fourtytwo;

class Test {

    private static void add(int i, int j) {

        System.out.println("int version");
    }

    private static void add(Integer i, Integer j) {

        System.out.println("Integer version");
    }

    public static void main(String[] args) {

        add(10, 20);
//        add(10.0, 20.0);
        add(new Integer(10), new Integer(20));
//        add(new Integer(10), 10);
        add(null, null);
    }
}
//  print "Integer version" on to the console
/*
    Method add is overloaded in Test class. Which overloaded method is invoked is decided at the compile time.
    add(10, 20); tags to int version as 10, 20 are int literals and direct match is available. So without any changes,
    above code prints "int version" on to the console.

    To print "Integer version" on to the console, add(Integer, Integer); method needs to be invoked. Let's check all the
    options one by one:

    "Remove add(int i, int j) method declaration and definition." add(10, 20); => auto-boxing will convert literal 10 and
    20 to Integer instances and will call the add(Integer, Integer) method. So this option is valid.

    Replace add(10, 20); by add(new Integer(10), new Integer(20)); => This statement is specifically calling
    add(Integer, Integer); So this option is also valid.

    Replace add(10, 20); by add(10.0, 20.0);  10.0 and 20.0 are default literals and can't be mapped to int or Integer
    types, hence this gives compilation error. Not a valid option.

    Replace add(10, 20); by add(null, null);  As Integer is reference type hence add(null, null); maps to
    add(Integer, Integer); So this is also a valid option.
 */