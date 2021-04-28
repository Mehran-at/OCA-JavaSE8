package com.oca.localdatatime.nineteenth;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Main {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.parse("1947-08-15", DateTimeFormatter.ISO_DATE); // with offset if available
        LocalDate date2 = LocalDate.parse("1947-08-15", DateTimeFormatter.ISO_LOCAL_DATE); // without offset
        LocalDate date3 = LocalDate.of(1947, 8, 15);

        System.out.println(date1.equals(date2) + " : " + date2.equals(date3));

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}
/*
    ISO_LOCAL_DATE formatter formats the date without the offset, such as "1947-08-15".

    ISO_DATE formatter formats the date with offset (if available), such as "1947-08-15" or "1947-08-15+05:30",
    but remember LocalDate object doesn't contain any offset information.

    In this case, all the three date instances are meaningfully equal.
 */