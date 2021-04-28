package com.oca.arraysandarrayslist.sixty;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        String[] arr = new String[7];
        System.out.println(Arrays.toString(arr));
    }
}
/*
    Variable 'arr' refers to an array object of String of 7 elements and it contains the memory address of String array
    object.

    'arr' is of reference type, therefore when `System.out.println(arr);` is executed, toString() method defined in
    Object class is invoked, which returns <fully qualified name of internal array class>@<hexadecimal representation
    of hashcode>. That is why some text containing @ symbol is printed on to the console.
 */