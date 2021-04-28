package com.oca.inheritance.sixtyfive;

class Test {

    public static void main(String[] args) {

        System.out.println(I1.i); //Line n2
        System.out.println(I2.i); //Line n3
//        System.out.println(I3.i); //Line n4
    }
}
/*
    Variable 'i' declared inside interface I1 is implicitly public, static and final and similarly variable i declared
    inside interface I2 is implicitly public, static and final as well.

    In Java a class can extend from only one class but an interface can extend from multiple interfaces. static
    variables are not inherited and hence there is no issue with Line n1.

    I1.i points to variable 'i' of interface I1.

    I2.i points to variable 'i' of interface I2.

    I3.i is an ambiguous call as compiler is not sure whether to point to I1.i or I2.i and therefore, Line n4 causes
    compilation error.
 */