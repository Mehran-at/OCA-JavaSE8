package com.oca.localdatatime.eleven;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Main {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2021, 1, 11);
        Period period = Period.ofMonths(2);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm-dd--yy"); /* mm refers to minutes and MM is for months. */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd--yy"); /* mm refers to minutes and MM is for months. */
        System.out.println(formatter.format(date.minus(period))); // UnsupportedTemporalTypeException
        // according to requested format "MM-dd--yy" prints is 11-11--2020
    }
}
/*
    While working with dates, programmers get confused with M & m and D & d.

    Easy way to remember is that Bigger(Upper case) letters represent something bigger. M represents month & m represents
     minute, D represents day of the year & d represents day of the month.

    LocalDate's object doesn't have time component, mm represents minute and not months so at runtime format method
    throws exception.
 */