package com.oca.arraysandarrayslist.fiftennth;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List colors = new ArrayList();
//        List colors = new ArrayList<>(); This works also
        colors.add("green");
        colors.add(1);
        colors.add(true);
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add(200.0);
        colors.add(200.0f);
        colors.add(200.0D);
        colors.add((long) 200.0);

        colors.remove(3);
        colors.add(3, "cyan");
        System.out.println(colors);

        System.out.println(colors.get(2).getClass().getSimpleName());
        System.out.println(colors.get(3).getClass().getSimpleName());
        System.out.println(colors.get(9).getClass().getSimpleName());
    }
}
