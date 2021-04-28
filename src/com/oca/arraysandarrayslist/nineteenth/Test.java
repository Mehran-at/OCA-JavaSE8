package com.oca.arraysandarrayslist.nineteenth;

class Test {

    public static void main(String[] args) {

        Double[] doubleArray = new Double[2];
        System.out.println(doubleArray[0]);
        System.out.println(doubleArray[1]);
        System.out.println(doubleArray[0] /*-->*/ + /*<--*/ doubleArray[1]);/* Problem here starts with that + operator,
        when we try to add two null values together and that is not possible, and for that we get NullPointerException */
    }
}
/*0
    Array elements are initialized to their default values. arr is referring to an array of Double type, which is
    reference type and hence both the array elements are initialized to null.

    To calculate arr[0] + arr[1], java runtime converts the expression to arr[0].doubleValue() + arr[1].doubleValue().
    As arr[0] and arr[1] are null hence calling doubleValue() method throws NullPointerException.
 */