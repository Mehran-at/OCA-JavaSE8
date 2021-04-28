package com.oca.constructor.twelve;

class A {

    static int s;
    int ns;

    A(int ns) {     // (-1)             //  (1)                 // (3)

        if (s < ns) {   // (0 < -1) false    // (-1 < 1) true        // (1 < 3) true
            s = ns;     //                 // s = 1                 // s = 3
            this.ns = ns;//                // ns = 1                // ns = 3
        }
    }

    public void doPrint() {

        System.out.println("ns = " + ns + " s = " + s);
    }
}
class Test {

    public static void main(String[] args) {
        A a = new A(-1);
        a.doPrint(); // "ns = " + 0 + " s = " + 0
        System.out.println(A.s); // 0

        A b = new A(1);
        b.doPrint(); // "ns = " + 1 + " s = " + 1
        System.out.println(A.s); // 1

        A c = new A(3);
        c.doPrint(); // "ns = " + 3 + " s = " + 3
        System.out.println(A.s); // 3
    }
}
