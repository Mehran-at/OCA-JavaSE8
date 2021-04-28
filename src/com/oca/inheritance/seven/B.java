package com.oca.inheritance.seven;

class B extends A {

    String bounds;

    B(String bounds) {

        //n1
        super();
        this.bounds = bounds;
    }

    B(String type, int maxSpeed, String bounds) {

        //n2
        super(type, maxSpeed);
        this.bounds = bounds;
    }

    public static void main(String[] args) {

        B wolf = new B("Long");
        B tiger = new B("Feline", 80, "Short");

        System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);
        System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds);
    }
}
//Canine 60 Long
//Feline 80 Short
