package com.oca.methods.twenty;

class Main {

    public static void main(String[] args) {

        //Bitwise OR Operator
        int value1 = 6;
        int value2 = 5;
        int result = value1 | value2;
        System.out.println("=> " + result); // 7

        int x = 10;
        int y = ++x; // 11
        int z = 0;
        if (y >= 10 | y <= ++x) {// (11 >= 10 | 11 <= 12)      (true | true) // | is the logical OR (it will evaluate to
            // true if and only if at least one of the arguments is true.
            z = x; // 12
        } else {
            z = x++;
        }
        System.out.println(z); // 12
    }
}
 /*

        Bitwise OR can be applied to these integer types –  long, int, short, char, and byte.

        The Bitwise OR operator compares each binary digit of two integers and gives back 1 if either of them is 1.

        0110
        0101
        -----
        0111 = 7
  */