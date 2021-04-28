package com.oca.arraysandarrayslist.fifty;

class Main {

    private static int[] arr;
//    private static int[] arr = new int[0]; // length is zero
//    private static int[] arr = new int[16]; // length is 16

    public static void main(String[] args) {

        int[] arrr;
        if (arr.length > 0 && arr != null) { /* Here the order of LogicalAnd is not much thoughtful, as in a case when
            the first  condition evaluated false, second condition will never be evaluated. LogicalAnd needs both left
            and right hand side condition evaluate true, to return true */
            System.out.println(arr[0]);
        }
        System.out.println(/* arrr */); /* although arr as class variable will be initialized to null, but it needs to be
        initialized as local variable */

    }
}
/*
    Variable arr is a class variable of int[] type, so by default it is initialized to null.
    In if block, arr.length > 0 is checked first. Accessing length property on null reference throws NullPointerException.
 */