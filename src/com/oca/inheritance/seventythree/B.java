package com.oca.inheritance.seventythree;

class B extends A {

    public static void main(String[] args) {

        A a = new B();
        B b = (B) a;

        b.fly(); // Fly
        b.dance();// Dance

        B bb = new B();

        bb.fly();// Fly
        bb.dance();// Dance

        A bw = new A();
        B pw = (B) bw; // cause ClassCastException as sub type reference var can not refer to super type reference var
        pw.dance();
    }

    public void dance() {

        System.out.println("Dance");
    }
}
