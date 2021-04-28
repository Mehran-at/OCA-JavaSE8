package com.oca.localdatatime.sixteenth;

import java.time.LocalDate;

class Main {

    public static void main(String[] args) {

        LocalDate joiningDate = LocalDate.parse("2006-03-16");
        System.out.println(joiningDate.withDayOfYear(29)); // 2006-01-29
        System.out.println(joiningDate.withDayOfYear(33)); // 2006-02-02
        System.out.println(joiningDate.withDayOfYear(38)); // 2006-02-07
        System.out.println(joiningDate.withMonth(1)); // 2006-01-16
        System.out.println(joiningDate.withYear(1)); // 0001-03-16
    }
}
/*
    joiningDate --> {2006-03-16}.

    joiningDate.withDayOfYear(29) returns a new LocalDate object with the day of the Year altered.

    A year has 365 days, so 29 means 29th day of the year, which is 29th Jan 2006.

    NOTE: There are other with methods, you should know for the exam. withDayOfMonth(int), withMonth(int) and
    withYear(int).
 */