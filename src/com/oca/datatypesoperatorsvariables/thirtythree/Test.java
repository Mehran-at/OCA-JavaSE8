package com.oca.datatypesoperatorsvariables.thirtythree;

import java.util.Arrays;

class Test {

    public static void main(String[] args) {

        Counter[] arr = new Counter[0];

        /* INSERT */
//        for (Counter ctr : arr) { /* This will not print [100,100,100]
//            int x = ctr.getCount();
//            x = 100;
//        }
//        for (Counter ctr : arr) {
//            ctr.count = 100;
//        }

//        arr = new Counter[] {new Counter(-1000), new Counter(539), new Counter(0)};

//        for(Counter ctr : arr) {
//            ctr.increase(100 - ctr.count);
//        }

        System.out.println(Arrays.toString(arr));
    }
}
// How many blocks can replace /*INSERT*/ such that output is: [100, 100, 100]?

/*
    There are 2 ways to change the value of count variable of Counter class:

    1. As access modifier of count variable is public, hence it can easily be accessed from other classes using the
    instance of Counter class, such as `new Counter().count` or `obj.count` (where obj is reference variable of Counter
    type, referring to Counter variable's instance)

    2. By invoking the increase(int) method of Counter class.

    Now let's check all the blocks one by one:

    for(Counter ctr : arr) {
    ctr.count = 100;
    }
    ✓ It will assign 100 to count variables of three instances of Counter class.

    for(Counter ctr : arr) {
    ctr.increase(100 - ctr.count);
    }
    ✓ You must have noticed that value of count variable of 3 array elements are: -1000, 539, 0. How will you change all
     3 values to 100 using same expression? It is by adding 100 and subtracting current value. For example,

    -1000 + 100 -(-1000) = 100

    or

    539 + 100 - 539 = 100

    or

    0 + 100 - 0 = 100

    And same this is done by executing `ctr.increase(100 - ctr.count);` statement.

    for (Counter ctr : arr) {
    ctr.increase(100 - ctr.getCount());
    }
    ✓ Same as block no. 4. Only difference is ctr.getCount() is used instead of ctr.count.

    for(Counter ctr : arr) {
    ctr.increase(-ctr.getCount() + 100);
    }
    ✓ Same as block no. 5.

    for(Counter ctr : arr) {
    ctr.increase(-ctr.count + 100);
    }
    ✓ Same as block no. 4.
 */