package com.oca.datatypesoperatorsvariables.sixtyfive;

class Car {

    void speed(Byte val) { //Line n1
        System.out.println("DARK"); //Line n2
    } // Line n3

    void speed(byte... vals) {

        System.out.println("LIGHT");
    }
}
