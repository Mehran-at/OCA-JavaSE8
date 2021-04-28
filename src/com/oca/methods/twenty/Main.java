package com.oca.methods.twenty;

public class Main {

    public static void main(String[] args) {

        //Bitwise OR Operator
        int value1 = 6;
        int value2 = 5;
        int result = value1 | value2;
        System.out.println(result);

        int x = 10;
        int y = ++x;
        int z = 0;
        if (y >= 10 | y <= ++x) {
            z = x;
        } else {
            z = x++;
        }
        System.out.println(z);
    }
}
