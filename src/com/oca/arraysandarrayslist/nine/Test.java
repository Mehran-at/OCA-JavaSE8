package com.oca.arraysandarrayslist.nine;

import java.util.Arrays;

class Test {

    public static void main(String[] args) {

        int intArray[][] = new int[1][3];

        System.out.println("int array size " + intArray.length);
        System.out.println("intArray[0] size " + intArray[0].length);
//        System.out.println("intArray[1] size " + intArray[1].length);

        for (int i = 0 ; i < intArray.length ; i++)
            for (int j = 0 ; j < intArray[i].length ; j++)
                System.out.println(intArray[i][j] = 10);
        System.out.println(Arrays.deepToString(intArray));
    }
}
