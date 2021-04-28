package com.oca.localdatatime.eighteenth;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

class Main {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
        Period period = Period.parse("p-30000Y");
        System.out.println(date.plus(period)); // -28000-01-01
        System.out.println(date.getMonthValue()); // 1
    }
}
/*
    There are 2 type of methods available in LocalDate class: of(int, int, int) and of(int, Month, int). Month can
    either be passed as int value (1 to 12) or enum constants Month.JANUARY to Month.DECEMBER.

    Period.parse(CharSequence) method accepts the String parameter in "PnYnMnD" format, over here P,Y,M and D can be in
    any case. "p-30000y" means Period of -30000 years.

    The minimum supported LocalDate is: {-999999999-01-01} and maximum supported LocalDate is: {+999999999-12-31}. If
    period of -30000 years is added to 1st Jan 2000, then result is 1st Jan -28000.
 */