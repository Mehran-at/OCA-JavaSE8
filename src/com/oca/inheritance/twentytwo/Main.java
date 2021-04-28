package com.oca.inheritance.twentytwo;

import java.io.FileNotFoundException;
import java.io.IOException;

class Main {

    public static void main(String[] args) {

        SuperClass s = new SubClass();
        try {
            s.m1();
        } catch (FileNotFoundException e) {
            System.out.print("A");
        } catch(IOException e) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
    }
}
