package com.oca.loop.six;

public class Main {

    public static void main(String[] args) {
        int date[] = {2010, 2013, 2014, 2015, 2014};
        int key = 2014;
        int count = 0;
        for (int e : date)
            if (e != key) {
                continue;
//                count++;
            }
        System.out.println(count + "Found!");
    }

}
