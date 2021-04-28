package com.oca.exception.one;

class Test {

    public static void main(String[] args) throws Exception { /* main method must throw print method checked exception as
    it does not handle it. */

        X xobj = new X();
        xobj.print();
    }
}
