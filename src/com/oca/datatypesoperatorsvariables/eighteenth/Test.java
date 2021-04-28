package com.oca.datatypesoperatorsvariables.eighteenth;

class Test {

    char c;
    boolean b;
    float f;

    public static void main(String[] args) {

        Test f = new Test();
        f.printAllValues();
    }

    void printAllValues() {

        System.out.println("c = " + c);// char prints empty
        System.out.println("b = " + b);// false
        System.out.println("f = " + f);//  0.0
    }
}
