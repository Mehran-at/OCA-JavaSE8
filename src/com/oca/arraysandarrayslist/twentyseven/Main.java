package com.oca.arraysandarrayslist.twentyseven;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("Print deleted object: " + list.remove(0)/*null*/ + " Print result of boolean: "
                + list.remove(null)/*true*/);
    }
}
/*
    It is possible to add null to ArrayList instant.

    Initially list has 3 elements: [null, null, null].

    remove(int) returns the deleted member of the list. In this case `list.remove(0);` returns null as null was deleted
    from the 0th index. So, list is left with 2 elements: [null, null].

    remove(Object) returns true if deletion was successful otherwise false. In this case `list.remove(null)` removes first
    null from the list and returns true and list is left with just one element: [null].

    Hence, the output is: 'null:true'.
 */