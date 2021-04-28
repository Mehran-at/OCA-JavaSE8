package com.oca.arraysandarrayslist.thirtysix;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(new Integer(101));
        list.add(101);

//        list.removeIf(i -> i == 101);
        list.removeIf(i -> i == new Integer(101));
        System.out.println(list);

        List<String> stringList = new ArrayList<>();
        stringList.add("David");
        stringList.add("Max");
        stringList.add("Julian");
        stringList.add("John");
//        stringList.removeIf(i -> "David");
        stringList.removeIf(i -> i == new String("David"));
        System.out.println(stringList);
    }
}
/*
    As list can store only wrapper objects and not primitives, hence for list.add(101); auto-boxing creates an Integer
    object {101}.

    for list.add(new Integer(101)); as new keyword is used so another Integer object {101} is created.

    for 3rd add method call, list.add(101); auto-boxing kicks in and as 101 is between -128 to 127, hence Integer object
    created at 1st statement is referred.

    removeIf(Predicate) method was added as a default method in Collection interface in JDK 8 and it removes all the
    elements of this collection that satisfy the given predicate.

    Boolean expression is : i == 101; in this expression i is wrapper object and 101 is int literal so java extracts int
    value of wrapper object, i and then equates. As all the 3 objects store 101, hence true is returned. All integer
    objects are removed form the list.

    If list.removeIf(i -> i == new Integer(101)); was used, then all three list elements would return false as object
    references are equated and not contents.
 */