package com.oca.datatypesoperatorsvariables.sixtytwo;

class Test {

    public static void main(String[] args) {

        /*INSERT*/
//        float x = 7, y = 200; /* 207.0 */
//        int x = 7, y = 200; /* 207 */
//        long x = 7, y = 200; /* 207 */
        double x = 7, y = 200; /* 207.0 */
//        short x = 7, y = 200; /* 207 */
//        byte x = 7, y = 200; /* compilation error for variable y, byte range is from -126 to 127 */
        System.out.println(String.valueOf(x + y).length()); // length of is 5 for "207.0"
    }
}
/*
    Compound declarations are allowed in Java for primitive type and reference type.

    Range of byte data type is from -128 to 127, hence if byte is used to replace INSERT, then y = 200 would cause
    compilation error as 200 is out of range value for byte type. Hence, byte cannot be used to replace INSERT.

        short, int, long, float & double can replace INSERT without causing any error. x + y will evaluate to 207 for
        short, int and long types whereas, x  + y will evaluate to 207.0 for float and double types.

        String class has overloaded valueOf methods for int, char, long, float, double, boolean, char[] and Object
        types. valueOf method returns the corresponding String object and length() method returns number of characters
        in the String object.

        So, `String.valueOf(x + y).length()` in case of short, int and long returns 3, on the other hand, in case of
        float and double it would return 5.

        Hence, only 3 options (short, int and long) print expected output on to the console.
 */