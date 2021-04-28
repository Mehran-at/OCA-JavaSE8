package com.oca.exception.twentynine;

import java.io.FileNotFoundException;
import java.io.IOException;

class Test {

//    public static void main(String[] args) throws Exception {
//
//        new Sub();
//    }

    public static void main(String[] args) throws Exception {


        try {
            new Sub();
        } catch (Exception ex) {
            ex = new Exception();
            throw ex;
        }
    }
}
