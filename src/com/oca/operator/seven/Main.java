package com.oca.operator.seven;

class Main {

    public static void main(String[] args) {

        int a = 7;
        boolean res = a++ == 7 && ++a == 9 || a++ == 9; //  7 == 7 and 9 ==9
//        boolean res1 = (a++) == 7 && ++a == 9 || (a++) == 9;
//        boolean res2 = (a++) == 7 && (++a) == 9 || (a++) == 9;
//        boolean res3 = ((a++) == 7) && ((++a) == 9) || ((a++) == 9);
//        boolean res4 = (((a++) == 7) && ((++a) == 9)) || ((a++) == 9);
//        boolean res5 = ((7 == 7) && ((++a) == 9)) || ((a++) == 9); a = 8
//        boolean res6 = ((7 == 7) && (9 == 9)) || ((a++) == 9); a = 9
//        boolean res6 = (true && true) || ((a++) == 9); a = 9
//        boolean res6 = true || ((a++) == 9); a = 9 the right side of || will never get excuted as the left side is true

        System.out.println("a = " + a);
        System.out.println("res = " + res);
        System.out.println( false | false);
    }
}
