package com.oca.inheritance.thirteenth;

import java.util.ArrayList;
import java.util.Arrays;

class Tiger extends Cat {

    public static void main(String[] args) {

        ArrayList<Animal> myList = new ArrayList<>();
        myList.add(new Tiger());

        ArrayList<Hunter> myList1 = new ArrayList<>();
        myList1.add(new Cat());

        ArrayList<Hunter> myList2 = new ArrayList<>();
        myList2.add(new Tiger());

//        ArrayList<Tiger> myList3 = new ArrayList<>();
//        myList3.add(new Tiger());
//        myList3.add(/*(Tiger)*/ new Cat());// compiler error. can not refer to cat without explicit constructor cast
//
//        ArrayList<Tiger> myList5 = new ArrayList<>();
//        myList5.add(new Hunter()); // compiler error
//
//        ArrayList<Tiger> myList6 = new ArrayList<>();
//        myList6.add(new Animal()); // compiler error

        ArrayList<Animal> myList4 = new ArrayList<>();
        myList4.add(new Cat());

        System.out.println(myList);
        System.out.println(myList1);
        System.out.println(myList2);
//        System.out.println(myList3);
        System.out.println(myList4);

    }
}
