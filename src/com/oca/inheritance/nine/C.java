package com.oca.inheritance.nine;

class C extends B {

    public void test() { System.out.println("C"); }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A a1 = new B();
//        B b1 = new A(); Cause computation Error
//        B b2 = (B)new A(); Cause NullPointerException

        B b5 = new C();
        b5.test();

        A b1 = new A();
        A b2 = new C();
        b1 = (A) b2;// Because of this cast C c2 = (C)b1; does not throw ClassCastException

        A b3 = (B) b2;
        A b4 = (B) b2;

        b1.test();
        b3.test();

        System.out.println("----------------------");
        C c1 = (C)b2;
//        b2 = new A(); // Or
        b2 = b1;
        c1.test();

        C c2 = (C)b1;
        c2.test();
    }
}
