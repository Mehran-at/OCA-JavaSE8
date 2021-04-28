package com.oca.inheritance.seventy;

interface A {

    public default String getName() {

        return "Animal";
    }

//    public abstract String getName();
}

interface B {

    public abstract String getName();
}

abstract class C implements B, A {


    @Override
    public String getName() {

        System.out.println("just overridden");
        return null;
    }
}

class M extends C {

}

class Main {

    public static void main(String[] args) {

        new M().getName();

        A a = new M();
        a.getName();// just overridden

        B b = new M();
        b.getName();// just overridden

        C c = new M();
        c.getName();// just overridden

//        A a11 = null; // NullPointerException
//        a11.getName();

//        A.getName(); /* non static methods can not be referenced from static methods. */
    }


}