package com.oca.operator.terneryoperator.one;

class Main {

    public static void main(String[] args) {

        int x = 100; // x = 103
        int a = x++; // a = 100
        int b = ++x; // b = 102
        int c = x++; // c = 102

        int d = (a < b) ? ((a < c) ? a : ((b < c) ? b : c)) : x; //
        //      (100<101)?((100<102)?100:((102<102)?102:102)) : 103;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("x= " + x);
        System.out.println("d= " + d);
    }
}
