package com.oca.datatypesoperatorsvariables.seventy;

class Test {

    public static void main(String[] args) {

        Counter ctr1 = new Counter();
        Counter ctr2 = new Counter();
        Counter ctr3 = new Counter();

        for (int i = 1 ; i <= 5 ; i++) {
            ctr1.ctr++;
            ctr1.count++;
            ctr2.ctr++;
            ctr2.count++;
            ctr3.ctr++;
            ctr3.count++;
        }

        System.out.println(ctr3.ctr + ":" + ctr3.count);
    }
}
/*
    Each instance of the class contains separate copies of instance variable and share one copy of static variable.

    There are 3 instances of Counter class created by main method and these are referred by ctr1, ctr2 and ctr3.

    As 'ctr' is a static variable of Counter class, hence ctr1.ctr, ctr2.ctr and ctr3.ctr refer to the same variable.
    In fact, 'Counter.ctr' is the preferred way to refer the static variable 'ctr' but ctr1.ctr, ctr2.ctr and ctr3.ctr
    are also allowed.

    As 'count' is an instance variable, so there are 3 separate copies: ctr1.count, ctr2.count, ctr3.count.

    On the completion of for loop: ctr1.count = 5, ctr2.count = 5 and ctr3.count = 5 and Counter.ctr = 15.

    15:5 is printed on to the console.
 */