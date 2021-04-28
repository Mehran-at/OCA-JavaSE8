package com.oca.arraysandarrayslist.fourtyeight;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        Integer i = 10;
        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(new Integer(i));
        list.add(new Integer(10));
        list.add(i);

//        list.removeIf(i -> i == 10);
        list.removeIf(l -> l == 10);

        System.out.println(list);
    }
}
/*
    Variable "i" used in lambda expression clashes with another local variable "i" and hence causes compilation error.
 */