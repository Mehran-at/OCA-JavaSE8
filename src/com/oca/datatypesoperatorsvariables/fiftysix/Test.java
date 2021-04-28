package com.oca.datatypesoperatorsvariables.fiftysix;

class Test {

    public static void main(String[] args) {

        final int a4 = 40000;
//        short b4 = a4; /* Range of short data type is from -32768 to 32767. */

        int c4 = 10;
//        short d4 = c4; /* Since c4 variable is int type and not final, Java assumes that its value can change and
//        exceed max short range of short data type. So it gives compilation error. */

        final int e4 = 25000;
        final int f4 = 25000;
        short g4 = (short) (e4 + f4);

        final int jz = 15;
        final int zj = 15;
//        short jzj = e4 + f4; /* this line cause compiler error as it is not possible to add final var to assign them to
//        short. */


        final int h4 = 10;
        short i4 = h4;

        final int j4 = 10;
        short k4 = j4 + 100;

        short s2 = (short) 32768;
        System.out.println(s2);
    }
}
/*
    Let's check all the statements one by one:

    short s1 = 10;

    Above statement compiles successfully, even though 10 is an int literal (32 bits) and s1 is of short primitive type which can store only 16 bits of data.

    Here java does some background task, if value of int literal can be easily fit to short primitive type (-32768 to 32767), then int literal is implicitly casted to short type.

    So above statement is internally converted to:

    short s1 = (short)10;

    short s2 = 32768;

    It causes compilation failure as 32768 is out of range value.

    final int i3 = 10;

    short s3 = i3;

    Above code compiles successfully. If you are working with final variable and the value is within the range, then
    final variable is implicitly casted to target type, as in this case i3 is implicitly casted to short.

    final int i4 = 40000;

    short s4 = i4;

    It causes compilation failure as 40000 is out of range value.

    final int i5 = 10;

    short s5 = i5 + 100;

    Above code compiles successfully. If you are working with constant expression and the resultant value of the constant
    expression is within the range, then resultant value is implicitly casted. In this case, resultant value 110 is
    implicitly casted.

    final int m = 25000;

    final int n = 25000;

    short s6 = m + n;

    m + n is a constant expression but resultant value 50000 is out of range for short type, hence it causes compilation
    failure.

    int i7 = 10;

    short s7 = i7;

    Compilation error as i7 is non-final variable and hence cannot be implicitly casted to short type.
 */