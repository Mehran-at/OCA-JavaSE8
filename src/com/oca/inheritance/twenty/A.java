package com.oca.inheritance.twenty;

//public class A {
//Non abstract class can not include abstract methods.
abstract class A {

    int num = 100;
    String operation = null;

    protected abstract void help();

    void log() {

        System.out.println("SuperClass-log");
    }
}
