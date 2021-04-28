package com.oca.arraysandarrayslist.seventysix;

import java.util.Arrays;

class Test {

    public static void main(String[] args) {

        int[][] times = new int[3][3]/* This array is initialized to it's type's default value so it's:
        [[0,0,0][0,0,0][0,0,0]] */;
        System.out.println(times.length);
        for (int i = 0 ; i < times.length ; i++) {
            for (int j = 0 ; j < times.length ; j++) {
                System.out.println(i);
                System.out.println(j);
                times[i][j] = i * j;
                System.out.println(Arrays.deepToString(times));
            }
        }
        System.out.println("result = " + times[2][2]);
    }
}