package com.oca.datatypesoperatorsvariables.seventynine;

class Test {

    public static void main(String[] args) {

        int num = 20;
        if (num++ == num++) { //20 == 21 // num = 22
            System.out.println("EQUAL " + num);
        } else {
            System.out.println("NOT EQUAL " + num);
        }
    }
}
/*
    boolean expression: (num++ == num++)

    (10 == num++) //Left side operand is evaluated first, value 10 is used in the expression and variable num is
    incremented by 1, so num=11

    (10 == 11) //Right side operand is evaluated next, value 11 is used in the expression and variable num is
    incremented by 1, so num = 12

    Above expression evaluates to false, hence else block is executed and NOT EQUAL 12 is printed on to the console.
 */