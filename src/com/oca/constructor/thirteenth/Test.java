package com.oca.constructor.thirteenth;

class Test {

    private String color;

    public Test() { // This constructor calls the other Constructor
        this("white");
    }

    public Test(String color) {
        color = color; /* However this constructor assigns the method parameter to itself. */
    }

    public static void main(String[] args) {
        Test e = new Test();
        System.out.println(e.color);
    }
}
