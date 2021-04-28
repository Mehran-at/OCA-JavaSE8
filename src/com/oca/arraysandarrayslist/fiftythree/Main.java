package com.oca.arraysandarrayslist.fiftythree;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        Boolean[] arr = new Boolean[2];
        List<Boolean> list = new ArrayList<>();
        list.add(arr[0]);
        list.add(arr[1]);

        System.out.println(list.size());

        if (list.remove(0 /* null */)) { /* remove method get an int argument in this case, but we pass a null value to it */
            list.remove(1 /* null */);
        }

        System.out.println(list);
    }
}
/*
    Default values are assigned to all array elements. As Boolean is of reference type, hence arr[0] = null
    and arr[1] = null. After addition list contains [null, null].

    list.remove(0) removes and returns the Boolean object referring to null. If expression can specify Boolean type,
    so no compilation error over here. At this point list contains [null].

    For the boolean expression of if-block, Java runtime tries to extract the stored boolean value using booleanValue()
    method, and this throws an instance of NullPointerException as booleanValue() method is invoked on null reference.
 */