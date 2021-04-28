package com.oca.inheritance.twentynine;

class Main {

    public static void main(String[] args) {

        A obj1 = new C();
        A obj2 = new B();
        C obj3 = (C) obj1; // This is absolutely fine as reference variable obj1 refers to object of c class
        obj3.print();
        C obj4 = (C) obj2; /* Cause classCastException as obj2 is of A type and point to B()*/
        obj3.print();
    }
}
/*
    Class A, B and C are declared public and inside same package com.udayan.oca. Method print() of class A has correctly
    been overridden by B and C.

    print() method is public so no issues in accessing it anywhere.

    Let's check the code inside main method.

    A obj1 = new C(); => obj1 refers to an instance of C class, it is polymorphism.

    A obj2 = new B(); => obj2 refers to an instance of B class, it is polymorphism.

    C obj3 = (C)obj1; => obj1 actually refers to an instance of C class, so at runtime obj3 (C type) will refer to an
    instance of C class. As obj1 is of A type so explicit typecasting is necessary.

    C obj4 = (C)obj2; => obj2 actually refers to an instance of B class, so at runtime obj4 (C type) will refer to an
    instance of B class. B and C are siblings and can't refer to each other, so this statement will throw ClassCastException
    at runtime.
 */