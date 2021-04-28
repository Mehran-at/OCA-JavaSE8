package com.oca.arraysandarrayslist.thirtyeight;

import java.util.ArrayList;
import java.util.List;

class Test {

    public static void main(String[] args) {

        List<Integer> intLists = new ArrayList<>();
        process(intLists);
    }

    public static void process(/*INSERT*/List<Integer> list) {

        list.add(100); //Line 2
        int x = list.get(0); //Line 3
        System.out.println(list.size() + ":" + x);
    }
}
/*
    Generic type can only be reference type and not primitive type, hence List<int> is not a valid syntax.

    If you use raw type List or List<Object> then Line 17 will give compilation error as list.get(0) will return Object
    type. Object type cannot be converted to primitive type int, so List and List<Object> will cause compilation
    failure of Line 17.

    List<Integer> is the only correct option.
 */