package com.oca.datatypesoperatorsvariables.fiftyseven;

class Test {

    public static void main(String[] args) {

        char c1 = 'a'; //ASCII code of 'a' is 97
        char range = 65535; // char range is from 0 to 65535.
        int i1 = c1; //Line n1
//        c1 = i1; /* cause compiler error as int cannot be fit to char with max range of 65535. We can use casting but
//        we loose data precision. */
        System.out.println(i1 + " -- " +  range); //Line n2
    }
}
/*
    Range of char data type is from 0 to 65535 and hence it can be easily assigned to int type. println() method is
    overloaded to accept char type and int type both. If char type value is passed, it prints char value and if int
    type value is passed, it prints int value.

    As i1 is of int type, hence corresponding int value, which is 97, is printed on to the console.
 */
