package com.oca.arraysandarrayslist.eighteenth;

import java.util.ArrayList;
import java.util.List;

class Test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
//        list.remove((Object)100);
        list.remove(100);

        System.out.println(list);
    }
}
