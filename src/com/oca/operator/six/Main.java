package com.oca.operator.six;

class Main {

    public static void main(String[] args) {

        int a = 2;
        boolean res = false;
        res = a++ == 2 || --a == 2 && --a == 2; // 2 == 2 ||
//        res = (a++) == 2 || --a == 2 && --a == 2;
//        res = (a++) == 2 || (--a) == 2 && (--a) == 2;
//        res = ((a++) == 2) || ((--a) == 2) && ((--a) == 2);
//        res = ((a++) == 2) || (((--a) == 2) && ((--a) == 2));
//        res = ((a++) == 2) || (((--a) == 2) && ((--a) == 2));
//        res = ((true) || ((true) && (false)));
        System.out.println(res);
        System.out.println(a);
        System.out.println(true ^ true);
        System.out.println(false ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);
        System.out.println("\n");
        System.out.println(true & true);
        System.out.println(false & true);
        System.out.println(true & false);
        System.out.println(false & false);
    }

}
