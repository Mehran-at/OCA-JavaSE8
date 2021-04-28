package com.oca.datatypesoperatorsvariables.thirtyone;

class Test {

    public static void main(String[] args) {

        Boolean b1 = new Boolean("tRuE");
        Boolean b2 = new Boolean("fAlSe");
        Boolean b3 = new Boolean("abc");
        Boolean b4 = new Boolean("treu");
        Boolean b5= null;
//        boolean b5 = null; /* primitive data type are not object, the can not be assigned to null. Hence this cause
//        compilation error*/
        System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4 + ":" + b5);
    }
}
/*
    Boolean class uses equalsIgnoreCase method to validate the passed String, so if passed String is "true"
    ('t', 'r', 'u' and 'e' can be in any case), then boolean value stored in Boolean object is true otherwise false.

    b1 stores true, b2 stores false, b3 stores false and as b4 is of reference type, hence it can store null as well.

    Output is: true:false:false:false:null
 */