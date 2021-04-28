package com.oca.localdatatime.eight;

import java.time.LocalDate;
import java.time.LocalTime;

class Test {

    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("1947-08-04");
        LocalTime time = LocalTime.MAX;// MAX Time is 23:59:59.999999999
        System.out.println(date.atTime(time)); // 1947-08-14T23:59:59.999999999
    }
}
/*
    LocalTime.MIN --> {00:00}, LocalTime.MAX --> {23:59:59.999999999},
    LocalTime.MIDNIGHT --> {00:00}, LocalTime.NOON --> {12:00}.

    date.atTime(LocalTime) method creates a LocalDateTime instance by combining date and time parts.

    toString() method of LocalDateTime class prints the date and time parts separated by T in upper case.
 */
/*
    DateTimeFormatter is defined inside which package?
    java.time.format
 */