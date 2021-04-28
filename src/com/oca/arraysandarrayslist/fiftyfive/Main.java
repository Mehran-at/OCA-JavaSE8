package com.oca.arraysandarrayslist.fiftyfive;

import java.util.ArrayList;
import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        int [] arr1 = new int[4];
        arr1[1] = 11;
        arr1[3] = 22;
        System.out.println(Arrays.toString(arr1));

        Object [] arr2 = new Object[4];
        arr2[1] = new Object();
        arr2[3] = new Object();
        System.out.println(Arrays.toString(arr2));

        Boolean[] arr = new Boolean[2];
        System.out.println("Arrays static length is: " + arr.length);
        System.out.println(arr[0] + ":" + arr[1]);

        ArrayList<Boolean> arr3 = new ArrayList<>();
        System.out.println("ArrayList size() is: " + arr3.size());
        System.out.println(arr3.get(0) + ":" + arr3.get(1));
    }
}
/*
    Array elements are initialized to their default values.

    arr is referring to an array of Boolean type, which is reference type and hence both the array elements are
    initialized to null and therefore in the output null:null is printed.
 */