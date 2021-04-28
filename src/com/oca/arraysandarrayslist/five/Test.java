package com.oca.arraysandarrayslist.five;

import java.util.ArrayList;

class Test {

    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        //when remove method get a number, it returns a the array type and remove the index of that number in array
        Integer remove = points.remove(2);
        //when remove method get object, it returns a boolean
        boolean remove1 = points.remove(null);
        System.out.println(points);
    }
}
