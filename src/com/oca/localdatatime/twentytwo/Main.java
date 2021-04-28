package com.oca.localdatatime.twentytwo;

import java.time.LocalDate;

class Main {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2068, 4, 15);
        System.out.println(date.getMonth() + ":" + date.getMonthValue()); // APRIL:4
    }
}
/*
    date.getMonth() returns the month of the year filed, using Month enum, all the enum constant names are in upper case.

    date.getMonthValue() returns the value of the month.

    NOTE: month value starts with 1 and it is different from java.util.Date API, where month value starts with 0.
 */