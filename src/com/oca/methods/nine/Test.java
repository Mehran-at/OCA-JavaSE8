package com.oca.methods.nine;

import java.util.ArrayList;
import java.util.List;

class Test {

    public static void main(String[] args) {

        List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);
        System.out.println("=>" + ps + "\n");

        int f = ps.indexOf(p2);
//        int f = ps.indexOf(new Patient("Mike"));
        Patient p = new Patient("Mike");
        int f1 = ps.indexOf(p);
        System.out.println("f= " + f);
        if (f >= 0)
            System.out.println("Mike Found");
    }
}