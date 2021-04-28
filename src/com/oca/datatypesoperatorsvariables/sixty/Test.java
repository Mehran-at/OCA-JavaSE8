package com.oca.datatypesoperatorsvariables.sixty;

import java.util.ArrayList;
import java.util.List;

class Test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        byte b = 10;
//        list.add(b); /*Line n1. b is auto-boxed to Byte and not Integer and List<Integer> can't store Byte objects,
//        therefore Line n1 causes compilation error. */
        int num = list.get(0) * list.get(0); //Line n2
        System.out.println(num); // cause NullPointerException as list is empty with no element at all.
    }
}