package com.oca.inheritance.twentyeight;

class Test {

    public static void main(String args[]) {

        M obj = new O();
        if (obj instanceof M) System.out.print("M");
        if (obj instanceof N) System.out.print("N");
        if (obj instanceof O) System.out.print("O");
        if (obj instanceof P) System.out.print("P");
    }
}
/*
    M
    ^
    N
    ^
    O [obj refers to instance of O class]
    ^
    P


    obj instanceof M -> true

    obj instanceof N -> true

    obj instanceof O -> true

    but

    obj instanceof P -> false
 */