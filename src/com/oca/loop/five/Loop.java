package com.oca.loop.five;

class Loop {

    public static void main(String[] args) {

        int num = 5;
        do {
            System.out.println(num-- + " "); // 5
        } while (num == 0); // 4
    }
}
