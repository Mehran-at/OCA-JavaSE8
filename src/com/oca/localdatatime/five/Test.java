package com.oca.localdatatime.five;

import java.time.LocalDateTime;

class Test {

    public static void main(String[] args) {

        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj.getSecond());
        System.out.println(obj.getMinute());
        System.out.println(obj.getHour());
    }
}
/*
    LocalDateTime stores both date and time parts. LocalDateTime.now(); retrieves the current date and time from the system
    clock. obj.getSecond() can return any value between 0 and 59.
 */