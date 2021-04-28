package com.oca.inheritance.twelve.p2;

import com.oca.inheritance.twelve.p1.Acc;

class Test extends Acc {

    public static void main(String[] args) {

        Acc obj = new Test();
        obj.s = 1;

        Test test = new Test();
        System.out.println(test.r + ":" + test.s); // 00

        take();
    }

    public static void take() {

        Acc obj = new Acc();
        obj.s = 1;
        System.out.println(obj.s); //1
    }
}
