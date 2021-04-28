package com.oca.datatypesoperatorsvariables.thirtyfour;

class Test {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(process(arr, 3, 8)); //Line 5
    }

//    private static String[] process(int[] arr, int st, int en) {
//
//        return null;
//    }

//    private static String process(int[] arr, int st, int en) {
//
//        return null;
//    }

//    private static int[] process(int[] arr, int st, int en) {
//
//        return null;
//    }

    private static int process(int[] arr, int st, int en) { /* primitive type can not be assigned to null as it's not an object. */

        return /* null */ 0;
    }
}
/*
    It is clear from Line 5 that, method name should be process, it should be static method, it should accept 3
    parameters (int[], int, int).

    As process(arr, 3, 8) is passed as an argument of System.out.println method, hence process method's return type can
    be anything apart from void. println method is overloaded to accept all primitive types, char [], String type and
    Object type. int[] are String [] are of Object type.

    In the given options, method specifying int as return type cannot return null as null can't be assigned to primitive
    type. int process(...) would cause compilation error.
 */