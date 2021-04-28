package com.oca.operator.nine;

class Main {

    public static void main(String[] args) {

        int a = 3;
        m(++a, a++); // m(5,3) 6 5 = 5
        System.out.println(a);
    }

    private static void m(int i, int j) {

        i++;
        j--;
    }
}
/*
    Method m works on copies and changes done to i and j are local to method m only.

    m(++a, a++); [a=3].

    m(4, a++); [a=4].

    m(4, 4); [a=5].


    System.out.println(a); => Prints 5 on to the console.
 */