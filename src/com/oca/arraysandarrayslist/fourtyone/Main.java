package com.oca.arraysandarrayslist.fourtyone;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        byte[] arr = new byte[0];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
    }
}
/*
    arr refers to an array object of size 0. That means arr stores some memory address.

    So we will not get NullPointerException in this case. But index 0 is not available for an array object of size 0
    and thus ArrayIndexOutOfBoundsException is thrown at runtime.
 */