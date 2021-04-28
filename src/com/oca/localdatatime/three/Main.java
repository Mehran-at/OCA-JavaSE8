package com.oca.localdatatime.three;

import java.time.LocalDate;

class Main {

    public static void main(String[] args) {

//        LocalDate date = LocalDate.of(2012, 01, 32);
        LocalDate date = LocalDate.of(2012, 01, 31);
        date.plusDays(10); // does not change the date
        System.out.println(date); // 2012-01-10
    }
}
