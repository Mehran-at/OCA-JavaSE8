package com.oca.stringbuilder.ten;

class Test {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("TOMATO");
//        System.out.println(sb.reverse().replace("O", "A")); /* Line n1. replace(int, int, java.lang.String)'
        // in 'java.lang.StringBuilder' cannot be applied to '(java.lang.String, java.lang.String)' */
        System.out.println(sb.reverse().replace(4, 6, "X")); //Line n1. TOMATO
        System.out.println(sb.reverse().replace(5, 8, "O")); //Line n1 TOMAT
        System.out.println(sb.reverse().replace(7, 6, "O")); //Line n1
        System.out.println(sb.reverse().replace(-7, 6, "O")); //Line n1
    }
}
