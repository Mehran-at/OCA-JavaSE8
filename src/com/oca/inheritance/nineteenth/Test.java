package com.oca.inheritance.nineteenth;

import java.util.ArrayList;
import java.util.List;

class Test {

    public static void main(String[] args) {

        List<C> ccc = new ArrayList<C>();

        for (B bbb : ccc) {
            A aaa = bbb;
        }
    }

    public interface A {

    }

    public class B implements A {

    }

    public class C extends B {

    }
}
