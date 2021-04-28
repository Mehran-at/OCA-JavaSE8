package com.oca.operator.ten;

class Main {

    public static void main(String[] args) {

        int a = 3;
//        System.out.println(a++ == 3 || --a == 3 && --a == 3);
//        System.out.println((a++) == 3 || --a == 3 && --a == 3);
//        System.out.println(((a++) == 3) || ((--a) == 3) && ((--a) == 3));
//        System.out.println(((a++) == 3) || (((--a) == 3) && ((--a) == 3)));
//        System.out.println(((a++) == 3) || ((((--a) == 3) && ((--a) == 3)))); // && has higher precedence over ||
        System.out.println(((3) == 3) || ((((--a) == 3) && ((--a) == 3)))); // && has higher precedence over ||
        System.out.println((true) || ((((--a) == 3) && ((--a) == 3)))); // && has higher precedence over ||
    }
}
/*
    a++ == 3 || --a == 3 && --a == 3; [Given expression].

    (a++) == 3 || --a == 3 && --a == 3; [Postfix has got higher precedence than other operators].

    (a++) == 3 || (--a) == 3 && (--a) == 3; [After postfix, precedence is given to prefix].

    ((a++) == 3) || ((--a) == 3) && ((--a) == 3); [== has higher precedence over && and ||].

    ((a++) == 3) || (((--a) == 3) && ((--a) == 3)); [&& has higher precedence over ||].

    Let's start solving it:

    ((a++) == 3) || (((--a) == 3) && ((--a) == 3)); [a=3, res=false].

    (3 == 3) || (((--a) == 3) && ((--a) == 3)); [a=4, res=false].

    true || (((--a) == 3) && ((--a) == 3)); [a=4, res=false].  || is a short-circuit operator, hence no need to
    evaluate expression on the right.

    res is true and a is 4.
 */