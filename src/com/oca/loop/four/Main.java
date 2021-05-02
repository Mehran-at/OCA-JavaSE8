package com.oca.loop.four;

class Main {

    public static void main(String[] args) {

        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0; // 2
        int idx2 = 0; // 3

        do {
            idx++;
        } while (idx < size - 1); // 2 < 2

        System.out.println("The Top element: " + stack[idx]); // 30

        while (idx2 <= size - 1) { // 3 <= 2
            idx2++;
        }
        System.out.println("The Top element: " + stack[idx]); //
    }
}
