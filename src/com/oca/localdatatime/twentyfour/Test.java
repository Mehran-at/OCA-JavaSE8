package com.oca.localdatatime.twentyfour;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Test {

    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("2020-08-31"); /* pay attention to leap years which 2020 is one, and for that feb month has 29 days */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        System.out.println(date.plusMonths(-6)); // 2020-02-29
        System.out.println(formatter.format(date)); // 08-31-20
    }
}
/*
    plusMonths(long) method of LocalDate class returns a copy of this LocalDate with the specified number of months
    added. Negative argument will subtract the passed month(s), hence date.plusMonths(-6) doesn't cause any compilation
    error.

    This method adds the specified amount to the months field in three steps:

        Add the input months to the month-of-year field

        Check if the resulting date would be invalid

        Adjust the day-of-month to the last valid day if necessary

    For the given code,

    2020-08-31 plus -6 months would subtract 6 months from the given date and would result in the invalid date
    2020-02-31. Instead of returning an invalid result, the last valid day of the month, 2020-02-29, is returned.

    Please note, 2020 is leap year and hence last day of February is 29 and not 28.
 */