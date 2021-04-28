package com.oca.exception.twentyseven;

import java.io.FileNotFoundException;

class Test {

    public static void main(String[] args) {

        try {
            System.out.println(args[1].length());
        } catch (RuntimeException ex) {
            System.out.println("ONE");
        } /* catch (FileNotFoundException ex) {
            System.out.println("TWO");
        } */
        System.out.println("THREE");
    }
}
