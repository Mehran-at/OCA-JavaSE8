package com.oca.inheritance.sixtyeight;

class Test {

    public static void main(String[] args) {

        A log = new B(); //Line n5
        System.out.print(log.count()); // 100
        System.out.print(log.get()); // COM-LOG
    }
}
/*
    CommunicationLog class overrides count() and get() methods of Log class.

    There are 2 rules related to return types:

    1. If return type of overridden method is of primitive type, then overriding method should use same primitive type.

    2. If return type of overridden method is of reference type, then overriding method can use same reference type or
    its sub-type (also known as covariant return type).

    count() method at Line n1 returns long but overriding method at Line n3 returns int and that is why Line n3 causes
    compilation error.

    get() method at Line n2 returns Object but overriding method at Line n4 returns String. String is a subclass of
    Object, so it is a case of covariant return type and hence allowed. Line n4 compiles successfully.
 */