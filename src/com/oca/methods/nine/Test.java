package com.oca.methods.nine;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);
        System.out.println(ps);
        int f = ps.indexOf(p2);
//        int f = ps.indexOf(new Patient("Mike"));
//        Patient p = new Patient("Mike");
//        int f = ps.indexOf(p);
        System.out.println("f= " + f);
        if (f >= 0) System.out.println("Mike Found");
    }
}
