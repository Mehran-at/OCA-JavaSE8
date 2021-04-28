package com.oca.constructor.four;

class Test {

    int count;

    private static void increment(Test counter) {

        counter.count++;
    }

    public static void main(String[] args) {

        Test c1 = new Test();
        Test c2 = c1;
        Test c3 = null;
        c2.count = 1000;
        Test c4 = new Test();
        increment(c2);
        System.out.println(c2.count);
        System.out.println(c1.count);
        System.out.println(c4 == c2);
        System.out.println(c4.count == c2.count);
        increment(c4);
        System.out.println(c4.count == c2.count);
    }
}
/*
    new Counter(); is invoked only once, hence only one Counter object is created in the memory.

    c1, c2, c3 and counter are reference variables of Counter type and not Counter objects.
 */