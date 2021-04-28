package com.oca.localdatatime.ten;

import java.time.Period;

class Main {

    public static void main(String[] args) {

        Period period = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2); // method chaining does
        // not work here and only last method get executed
        System.out.println(period);
    }
}
