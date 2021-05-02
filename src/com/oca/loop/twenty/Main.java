package com.oca.loop.twenty;

class Main {

    public static void main(String[] args) {

        final boolean flag1 = false;

        final boolean flag;
        flag = false;
        while (flag) {
            System.out.println("Good Morning!");
        }

//        while (flag1) { /* cause compilation error cause now Compiler recognizes flag1 as a compile time constant. */
//            System.out.println("Good Morning!");
//        }
    }
}
/*
    final boolean flag; flag = false; doesn't make flag a compile time constant.

    Compiler doesn't know flag's value at compile-time and hence it allows this syntax.

    At runtime, as boolean expression of while loop is false, loop doesn't execute even once and hence no output.
 */
