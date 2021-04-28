package com.oca.inheritance.sixtynine;

interface I1 {

    default int maxDays() {

        return 1;
    }

    static int minDays() {

        return -1;
    }
}
