package com.oca.inheritance.twenty;

class B extends A {

    protected String operation = "LOGGING";
    private int num = 200;

    public static void main(String[] args) {

        new B().help();
        new B().log();
        A a = new B();
        System.out.println(a.num);
        System.out.println(a.operation);
        B b = new B();
        System.out.println(b.operation);
        System.out.println(b.num);
    }

    //    void help() {
    protected void help() {

        System.out.println("SubClass-help");
    }

    void log() {

        System.out.println("SubClass-log");
    }
}
