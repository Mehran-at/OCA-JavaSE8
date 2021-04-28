package com.oca;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Short a = 200;
        Integer b = 400;
        Long c = (long) a + b;
//        String d = (String) (c * b);

        byte x = 5;
        byte y = 10;
        double z = x + y;
        System.out.println(z);

        boolean x1 = true, z1 = true;
        x1 = (y != 10) ^ (z1 = false);

        for (int i = 9 ; i < 10 ; ++i) {

            System.out.println("Hello World");
        }


        StringBuilder puzzle = new StringBuilder("Java");
        String vaJ$ = puzzle.append("vaJ$").substring(0, 4);
        System.out.println(vaJ$);


        int[] random = {6, -4, 12, 0, -10};
        int[] random1 = {-10, -4, 0, 6, 12};
        Integer x11 = 12;
        int y11 = Arrays.binarySearch(random, x11);
        System.out.println(y11);
        List<Integer> list = Arrays.asList(10, 4, -1, 5);
        Collections.sort(list);
        System.out.println(list);

        String[] names = {"Tom", "Dick", "Harry"};
        List<String> list22 = Arrays.asList(names);
        list22.set(0, "Sue");
        System.out.println(names[0]);

        List<String> hex = Arrays.asList("30", "8", "3A", "FF");

        Collections.sort(hex);
        System.out.println(hex);

        int y3 = 1;
        do {
            System.out.println(y3++ + "");
        } while (y3 <= 10);



        String letters = " Java ";
        System.out.println("result" + letters.substring(0).trim());
        System.out.println("result" + letters instanceof Object);

        int iVar = 100;
        float fVar = 100.100f;
        double dVar = 123;
//        iVar = fVar;
//        fVar = dVar;
//        iVar = dVar;
        fVar = iVar;
        dVar = iVar;
        dVar = fVar;
    }
}
