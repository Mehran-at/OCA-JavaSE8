package com.oca.inheritance.seven;

class A {

    String type = "Canine";
    int maxSpeed = 60;

    A() {

        this("Canine",  60);
    }

    A(String type, int maxSpeed) {

        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}
