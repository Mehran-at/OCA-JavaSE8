package com.oca.arraysandarrayslist.twelve;

class Test {

    public static void main(String[] args) {

        int[] numbers;
        numbers = new int[2];// [0, 0]
        numbers[0] = 10;
        numbers[1] = 20;
        numbers = new int[4];// [0, 0, 0, 0]
        numbers[2] = 30;// [0, 0, 30, 0]
        numbers[3] = 40;// [0, 0, 30, 40]
        for (int x : numbers) {
            System.out.println(" " + x);
        }
    }
}
