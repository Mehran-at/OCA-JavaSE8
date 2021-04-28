package com.oca.switchstatement.six;

class Main {

    public static void main(String[] args) {

        int var = '7';
//        Integer var = '7';
        switch (var) {
            case '7':
                System.out.println("Lucky Luck");
                break;
            default:
                System.out.println("default");
        }
    }
}
/*
    int var = 7; => DEFAULT,

    Integer var = 7; => var is of Integer type and case contains char '7'. char '7' cannot be compared with Integer and
    hence compilation error. case '7' can easily be compared with int value but not with Integer type.

    int var = '7'; => Lucky no. 7

    HINT: There is no need to remember. case '7' value means you are trying to equate or compare var (Integer value)
    with '7' (char).

    If assignment operation works then method invocation, switch expression parameter etc. will also work. Integer
    var = 7; is possible but Integer var = '7'; causes compilation error as char cannot be converted to Integer.
 */