package com.oca.localdatatime.twentyfive;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Test {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2021, 03, 17); //LocalDate.of accept only comma separated dates
        LocalDate date3 = LocalDate.parse("2021-03-17", DateTimeFormatter.ISO_LOCAL_DATE);//LocalDate.parse accept only minus(-) separated dates
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date2.equals(date3));
        System.out.println(date2== date3);
    }
}
