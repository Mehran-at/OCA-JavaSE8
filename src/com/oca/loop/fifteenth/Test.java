package com.oca.loop.fifteenth;

class Test {

    public static void main(String[] args) {

        int x = 5;
        int j = 0;
        OUTER:
        for (int i = 0 ; i < 3 ; ) {
            INNER:
            do {
                i++; // 5 6
                x++; // 10 14
                if (x > 10) // 7 > 10
                    break INNER;
                x += 4; // 14
                j++; // 1
            } while (j <= 2); // 1 <= 2
        }
        System.out.println(x);
    }
}
