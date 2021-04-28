package com.oca.arraysandarrayslist.one;

import java.util.Arrays;

class Test {

    public static void main(String[] args) {

        int[] intArr = {15, 30, 45, 60, 75};
        intArr[2] = intArr[4]; //   15, 30, 75, 60, 75
        intArr[4] = 90; //   15, 30, 75, 60, 90
        System.out.println(Arrays.toString(intArr));
    }
}
