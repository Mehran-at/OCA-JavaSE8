package com.oca.methods.five;

public class Alpha {

    static int s;
    int ns;

    Alpha(int ns) {
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }

    public static void main(String[] args) {
        Alpha ref1 = new Alpha(100);
        Alpha ref2 = new Alpha(50);
        Alpha ref3 = new Alpha(125);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }

    void doPrint() {
        System.out.println("ns = " + ns + " s = " + s);
    }
}
