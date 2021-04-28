package com.oca.inheritance.seventyone;

import java.io.IOException;

class Deer extends Animal {

    void jump() { //Line n1
        System.out.println("DEER JUMPS");
    }

//    void jump() throws RuntimeException { //Line n1
//
//        System.out.println("DEER JUMPS");
//    }

//    void jump() throws IllegalArgumentException { //Line n1
//
//        System.out.println("DEER JUMPS");
//    }

//    void jump() throws Error { //Line n1
//
//        System.out.println("DEER JUMPS");
//    }

    void jump(int i) {

        System.out.println("DEER JUMPS TO " + i + " FEET");
    }




}
