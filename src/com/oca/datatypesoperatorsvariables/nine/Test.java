package com.oca.datatypesoperatorsvariables.nine;

class Test {

    public static void main(String[] args) {

        System.out.print("Start execution:" + Order.result + " "); // Start execution:u-
        System.out.print(Order.result + " ");// Start execution:u-u-
        new Order(); // Start execution:u-u-ucr
        new Order(); // Start execution:u-u-ucrcr
        System.out.print(Order.result + " ");
    }
}
// How this works ?