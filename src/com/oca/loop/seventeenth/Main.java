package com.oca.loop.seventeenth;

class Main {

    public static void main(String[] args) {

        int start = 1;
        int sum = 0;

        do {
            if (start % 2 == 0) {
                continue;
            }
            sum += start; // 25
        } while (++start <= 10);
        System.out.println(sum);
    }
}
/*
    When start is divisible by 2 [2, 4, 6, 8, 10], continue; statement takes the control to boolean expression and hence
    sum += start; is not executed.

    Hence result is the sum of numbers 1,3,5,7,9.
 */