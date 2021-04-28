package com.oca.conditions.three;

class Test {

    public static void main(String[] args) {

        String[] arr = {"L", "I", "V", "E"}; //Line n1
        int i = -2;

        if (i++ == -1) {        //Line n2. i = -1
//        if ((i++) == -1) {
            arr[-(--i)] = "F"; //Line n3
        } else if (--i == -2) { //Line n4. i = -2
//        } else if ((--i) == -2) {
            arr[-++i] = "O"; //Line n5. i = 1  {"L", "O", "V", "E"}
//            arr[-(++i)] = "O";
        }

        for (String s : arr) {
            System.out.print(s);
        }

        i = -2;

        if (++i == -1) {        //Line n2. i = -1
            arr[-(--i)] = "F"; //Line n3 i = 2  {"L", "I", "F", "E"}
        } else if (-i == -2) { //Line n4. i = -2
            arr[-++i] = "O"; //Line n5. i = 1   {"L", "O", "F", "E"}
        }

        for (String s : arr) {
            System.out.print(s);
        }
    }
}
/*
    Line n1 creates a String [] object of 4 elements and arr refers to this array object. arr[0] = "L", arr[1] = "I",
    arr[2] = "V" and arr[3] = "E".

    i = -2.

    Boolean expression of Line n2: i++ == -1

    => (i++) == -1 //As Post-increment operator ++ has higher precedence over ==

    => -2 == -1 //i = -1, value of i is used in the expression and then incremented.

    => false and hence Line n3 is not executed.

    But there is no issue with Line n3 and it compiles successfully.

    Boolean expression of Line n4 is evaluated next:

    --i == -2 //i = -1

    => (--i) == -2 //As Pre-decrement operator -- has higher precedence over ==

    => -2 == -2 //i = -2, value of i is decremented first and then used in the expression.

    => true and hence Line n5 is executed next.

    Line n5:

    arr[-++i] = "O"; //i = -2

    => arr[-(++i)] = "O"; //Unary minus '-' and pre-increment '++' operators have same precedence

    => arr[-(-1)] = "O"; //i = -1, value of i is incremented first and then used in the expression.

    => arr[1] = "O"; //2nd array element is changed to "O".

    Hence after Line n5, arr refers to {"L", "O", "V", "E"}

    Given first loop prints LOVE on to the console.
 */