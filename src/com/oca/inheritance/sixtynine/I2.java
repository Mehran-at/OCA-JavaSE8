package com.oca.inheritance.sixtynine;

interface I2 extends I1 {

    default int maxDays() {

        return 2;
    }

    static int minDays() { // this ain't no override for minDays() in I1 as interface static methods can not be overridden

        return -2;
    }
}
