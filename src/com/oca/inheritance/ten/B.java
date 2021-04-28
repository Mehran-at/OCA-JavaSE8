package com.oca.inheritance.ten;

class B extends A {

    int c;

    B(int r, int c) {
        super(r);
        this.c = c;
    }

    @Override
    public String toString() {
        return "DVD{" + "r=" + r + ", c=" + c + '}';
    }

    public static void main(String[] args) {
        B dvd = new B(10, 20);
        System.out.println(dvd); // DVD{r=10, c=20}
        System.out.println("r in superclass is: " + dvd.r); // r in superclass is: 10
        System.out.println("c in childClass is: " + dvd.c); // c in childClass is: 20
    }
}
