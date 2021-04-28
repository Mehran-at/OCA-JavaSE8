package com.oca.arraysandarrayslist.twentynine;

class Main {

    public static void main(String[] args) {

        int[] arr = {3, 2, 1};// size = 3
        for (int i : arr) {
            System.out.println(arr[i]);// arr[3] cause ArrayIndexOutOfBoundsException
        }
    }
}
