package com.oca.localdatatime.two;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Main {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
        dt = dt.plusDays(30);
        dt = dt.plusMinutes(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));// 2014-08-30 August has 31 days
    }
}
