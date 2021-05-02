package com.oca.methods.twentyfive;

class Test {

    static int i2 = 20;
    int i1 = 10; //Line n1

    private static void change2(int val) {

//        i1 = --val; //Line n3. non-static variable cannot be accessed via static methods.
        i2 = val--; //Line n4
    }

    public static void main(String[] args) {

//        change1(5); //Line n5. non-static methods cannot be accessed via static methods.
        change2(5); //Line n6
//        System.out.println(i1 + i2); //Line n7
    }

    private void change1(int val) {

        i1 = ++val; //Line n1
        i2 = val++; //Line n2
    }
}
/*
    i1 is an instance variable and i2 is a static variable.

    Instance method can access both instance and static members. Hence, Line n1 and Line n2 compile successfully.

    Static method can access only static members. Hence, Line n3 [accessing instance variable i1], Line n5 [accessing
    instance method change1(int)] and Line n7 [accessing instance variable i1] cause compilation error.
 */