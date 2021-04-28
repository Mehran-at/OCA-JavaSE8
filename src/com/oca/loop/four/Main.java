package com.oca.loop.four;

public class Main {

    public static void main(String[] args) {
        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;
        int idx2 = 0;
        do {
            idx++;
        } while (idx < size - 1);
        System.out.println("The Top element: " + stack[idx]);

        while (idx2 <= size - 1) {
            idx2++;
        }
        System.out.println("The Top element: " + stack[idx]);
    }
}
