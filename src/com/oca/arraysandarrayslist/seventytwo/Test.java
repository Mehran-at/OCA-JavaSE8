package com.oca.arraysandarrayslist.seventytwo;

import java.util.Arrays;

class Test {

    public static void main(String[] args) {

        // I don't understand this com.oca.loop
        int num[][] = new int[1][3];//i<1
        for (int i = 0 ; i < num.length ; i++) {
            System.out.println("num length is:  " + num.length);
            for (int j = 0 ; j < num[i].length ; j++) {
                System.out.println("i is: " + i);
                System.out.println("num[i] length is: " + num[i].length);
                num[i][j] = 10;
                System.out.println("num [" + i + "] [" + j + "] = " + num[i][j]);
            }
            System.out.println(Arrays.toString(num));// This will override to String method of the Array, not Array elements
            System.out.println(Arrays.deepToString(num));// This will do the up task plus objects in that Array
        }
    }
}
