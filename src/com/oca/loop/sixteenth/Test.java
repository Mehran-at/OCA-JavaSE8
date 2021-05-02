package com.oca.loop.sixteenth;

class Test {

    public static void main(String[] args) {

//        final boolean flag = false;
        final boolean flag = true;
        while (flag) {
            System.out.println("YoYo!");
        }

//        while (true) {
//            System.out.println("LaLa!"); cause compilation error as compiler recognizes that the other loop wont let
//            this to be executed.
//        }
    }
}
/*
    final boolean flag = false; statement makes flag a compile time constant.

    Compiler knows the value of flag, which is false at compile time and hence it gives "Unreachable Code" error.
 */