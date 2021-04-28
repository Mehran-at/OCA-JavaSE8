package com.oca.inheritance.twentyseven;

import java.util.ArrayList;
import java.util.List;

class Test {

    public static void main(String[] args) {

        {
            List<A> list = new ArrayList<>();
            list.add(new C());
        }
        {
            List<A> list2 = new ArrayList<>();
            list2.add(new B());
        }
        {
            List<B> list3 = new ArrayList<>();
            list3.add(new C());
        }
        {
            List<D> list4 = new ArrayList<>();
//        list4.add(/*(D)*/new B());
        }
        {
            List<D> list5 = new ArrayList<>();
            list5.add(new C());
        }
    }
}

/*
    Even though code seems to be checking the knowledge of ArrayList but it actually checks the knowledge of
    Polymorphism.

    List<Sellable> list = new ArrayList<>(); is valid statement and list can accept any object passing instanceof check
    for Sellable type.

    Rabbit implements Sellable hence new Rabbit() can be added to list.

    But as Mammal doesn't implement Sellable hence new Mammal() can't be added to list.


    Other initializer blocks can be verified on similar lines. So there is only one initializer block, which causes
    compilation error.
 */