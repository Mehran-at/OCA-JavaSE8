package com.oca.switchstatement.two;

class Test {

    public static void main(String[] args) {

        byte var = 100;
        switch (var) {
            case 100:
                System.out.println("var is 100");
                break;
//            case 200: /* cause compilation error as max range of byte is 127, so this counts as int which is not a byte
//            type as we used var which is of byte type.*/

            case 127:
                System.out.println("var is 200");
                break;
            default:
                System.out.println("In default");
        }
    }
}
/*
    case values must evaluate to the same type / compatible type as the switch expression can use.

    switch expression can accept following:

    char or Character

    byte or Byte

    short or Short

    int or Integer

    An enum only from Java 6

    A String expression only from Java 7


    In this case, switch expression [switch (var)] is of byte type.

    byte range is from -128 to 127. But in case expression [case 200], 200 is outside byte range and hence compilation error.
 */