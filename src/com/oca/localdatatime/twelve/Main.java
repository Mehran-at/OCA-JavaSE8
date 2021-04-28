package com.oca.localdatatime.twelve;

import java.time.LocalDate;

class Main {

    public static void main(String[] args) {

        LocalDate a1 = LocalDate.parse("2021-09-09");
        LocalDate a2 = LocalDate.parse("2021-09-09");
//        LocalDate a2 = LocalDate.parse("2021-9-09");
        LocalDate a3 = LocalDate.of(2021, 9, 9);
//        LocalDate a3 = LocalDate.of(2021,09,09);
        LocalDate a4 = LocalDate.of(2021, 9, 9);

        System.out.println((a1 == a2) + ":" + (a2 == a3) + ":" + (a3 == a4)); // false:false:false
        System.out.println((a1.equals(a2) ) + ":" + (a2.equals(a3)) + ":" + (a3.equals(a4))); // true:true:true

    }
}
/*
    parse" and "of" methods create new instances, so in this case you get 4 different instance of LocalDate stored at 4
    different memory addresses.

    LocalDate.parse(CharSequence) method accepts String in "9999-99-99" format only. Single digit month and day value
    are padded with 0 to convert it to 2 digits when printing.

    To represent 9th June 2018, format String must be "2018-06-09".

    If correct format string is not passed then an instance of java.time.format.DateTimeParseException is thrown.
 */