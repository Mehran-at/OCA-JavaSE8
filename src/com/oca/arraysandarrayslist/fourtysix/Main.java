package com.oca.arraysandarrayslist.fourtysix;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<String> days = new ArrayList<>();
        days.add("SUNDAY");
        days.add("SUNDAY");
        days.add("MONDAY");
        System.out.println(days.size());
        days.clear();
        System.out.println(days.size());
    }
}
/*
    ArrayList can have duplicate elements, so after addition, list is: [SUNDAY, SUNDAY, MONDAY]. days.size() returns 3
    so 3 is printed on to the console.

    days.clear(); removes all the elements from the days list, in fact days list will be empty after successful
    execution of days.clear();

    So 2nd System.out.println statement prints 0 on to the console.
 */