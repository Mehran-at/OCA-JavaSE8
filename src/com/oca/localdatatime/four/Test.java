package com.oca.localdatatime.four;

import java.time.Period;

class Test {

    public static void main(String[] args) {

        Period period = Period.of(0, 0, 0);
        Period period1 = Period.of(1988, 2, 29);
        Period parse = Period.parse("P2021Y01M22D");
        System.out.println(period);// print P0D
        System.out.println(parse);// P1988Y2M322D
        System.out.println(parse.getYears()); //2021
        System.out.println(parse.getMonths()); //1
        System.out.println(parse.getDays()); //22
        System.out.println(period1); // P1988Y2M29D
    }


}
/*
    Period.of(0, 0, 0); is equivalent to Period.ZERO. ZERO period is displayed as P0D, other than that, Period components
    (year, month, day) with 0 values are ignored.

    toString()'s result starts with P, and for non-zero year, Y is appended; for non-zero month, M is appended;
    and for non-zero day, D is appended. P,Y,M and D are in upper case.

    NOTE: Period.parse(CharSequence) method accepts the String parameter in "PnYnMnD" format, over here P,Y,M and D can be
    in any case.
 */
