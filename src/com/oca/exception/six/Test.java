package com.oca.exception.six;

import java.io.FileNotFoundException;
import java.io.IOException;

class Test {

//    public static void main(String[] args) {
    public static void main(String[] args) throws IOException {

        Super s = new Sub();
        try {
            s.m1();
        } catch (FileNotFoundException e) {
            System.out.print("M");
        } finally {
            System.out.print("N");
        }
    }
}
/*
    If calling code doesn't handle IOException or its super type, so s.m1(); gives compilation error.
 */
