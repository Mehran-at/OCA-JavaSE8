package com.oca.inheritance.three;

class B extends A {

    int y;

    B() {

        this(10);
    }

    B(int y) {

        super();
        this.y = y;
    }

    public static void main(String[] args) {

        B carAuto = new B();
        System.out.println(carAuto.toString());// 10:10
    }

    public String toString() {

        return super.x + ":" + this.y;
    }
}
