package com.oca.inheritance.seventeenth;

class Test {

    public static void main(String[] args) {

//        A obj1 = new A();
//        B obj2 = obj1;
//        obj2.print();

//        B obj3 = new B();
//        A obj4 = (A) obj3;
//        obj4.print();

        A obj1 = new A();
        B obj2 = (B) obj1;
        obj2.print();
    }
}
/*
    Class A and B are declared public and inside same package. Method print() of class A has correctly been overridden
    by B.

    print() method is public so no issues in accessing it anywhere.

    Let's check the code inside main method.

    A obj1 = new A(); => obj1 refers to an instance of class A.

    B obj2 = (B)obj1; => obj1 is of type A and it is assigned to obj2 (B type), hence explicit casting is necessary.
    obj1 refers to an instance of class A, so at runtime obj2 will also refer to an instance of class

    A. sub type can't refer to an object of super type so at runtime B obj2 = (B)obj1; will throw ClassCastException.
 */
