package com.oca.conditions.two;

class Test {

    public static void main(String[] args) {

        int localVar = 9;
        if (localVar++ < 10) // localVar = 9
            System.out.println(localVar + " Hello World!"); // localVar = 10
        else
            System.out.println(localVar + " Hello Universe!");
    }
}
