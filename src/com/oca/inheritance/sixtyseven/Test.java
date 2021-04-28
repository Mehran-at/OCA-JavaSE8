package com.oca.inheritance.sixtyseven;

class Test {

    public static void main(String[] args) {

        A[] arr = new A[2]; // null, null
        for (A b : arr) {
            System.out.println(b.salePercentage); //Line n1. 85 85
//            System.out.println(b.salePercentage()); //Line n2
            System.out.println(A.salePercentage()); //Line n2. 85% 85%
        }
        System.out.println("-----------------------");
        B[] Bs = new B[2]; // null, null
        for (B b : Bs) {
            System.out.println(b.salePercentage); //Line n3. 85 85
//            System.out.println(b.salePercentage()); //Line n4
            System.out.println(A.salePercentage()); //Line n4. 85% 85%
        }
    }
}
/*
    Variable 'salePercentage' declared inside interface A is implicitly public, static and final. As per Java 8,
    default and static methods were added in the interface. There is no compilation error in A.java file.

    class B implements A interface but as there is no abstract method in A interface, hence B class
    is not needed to implement any method. B.java file compiles successfully.

    `A [] arr = new A[2];` creates one dimensional array of 2 elements of A type and both the
    elements are initialized to null.

    There are some difference in which static variables and static methods of the interface are accessed.

    Correct and only way to access static method of an Interface is by using the name of the interface, such as
    A.salePercentage(). Line n2 and Line n4 cause compilation error.

    As far as public static final variable of interface is concerned, even through the correct way to access static
    variable is by using the name of the interface, such as A.salePercentage but it can also be accessed by
    using following:

    Reference variable of the interface: A obj1 = null; System.out.println(obj1.salePercentage);

    Name of the implementer class: System.out.println(B.salePercentage);

    Reference variable of the implementer class: B obj2 = null; System.out.println(obj2.salePercentage);

    Hence, Line n1 and Line n3 compile successfully.
 */