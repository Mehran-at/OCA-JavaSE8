package com.oca.localdatatime.twentyone;

import java.time.LocalTime;

class Main {

    public static void main(String[] args) {

        LocalTime time = LocalTime.of(23, 60); // cause compilation error as minute value should be
        // between 0 to 59
//        LocalTime time = LocalTime.of(23, 59);
        System.out.println(time);
    }
}
/*
    LocalTime.of(int hour, int minute) creates an instance of LocalTime class. Valid value for hour is: 0 to 23 and
    valid value for minute is 0 to 59 and second is 0 to 59.

    java.time.DateTimeException is thrown if invalid values are passed as arguments.

    NOTE: There are other overloaded of methods available:

    LocalTime of(int hour, int minute, int second) and

    LocalTime of(int hour, int minute, int second, int nanoOfSecond).

    Valid value for second is: 0 to 59 and valid value for nano second is: 0 to 999,999,999.

    so:

        hours 0 to 23
        min 0 to 59
        second 0 to 59
        nanos of second 0 to 999,999,999.
 */