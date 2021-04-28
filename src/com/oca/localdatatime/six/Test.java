package com.oca.localdatatime.six;

import java.time.LocalDate;

class Test {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2020, 8, 31); // September has 30 days so this cause compilation error
        System.out.println(date); // 2020-09-31
    }
}
/*
    Months with 30 days are September, April, June and November.
    All the rest have 31 Except February alone, Which has 28 days clear And 29 in each leap year.

    LocalDate.of(...) method first validates year, then month and finally day of the month.

    September can't have 31 days so LocalDate.of(...) method throws an instance of java.time.DateTimeException class.
 */