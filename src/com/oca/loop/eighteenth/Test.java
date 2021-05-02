package com.oca.loop.eighteenth;

class Test {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int x = 0;
//        for (int n = 3 ; n < arr.length ; n++) { // 4 + 5
//        for (int n = 1 ; n < arr.length - 1 ; n++) { // 2 + 3 + 4
        for (int n = 0 ; n < arr.length ; n += 2) {
            x += arr[n];
        }
        System.out.println(x);
    }
}
