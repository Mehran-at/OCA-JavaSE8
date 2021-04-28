package com.oca.stringbuilder.eleven;

import java.util.ArrayList;
import java.util.List;

class Test {

    public static void main(String[] args) {

        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("AAA")); //Line n1
        list.add(new StringBuilder("BBB")); //Line n2
        list.add(new StringBuilder("AAA")); //Line n3

        list.removeIf(sb -> sb.equals(new StringBuilder("AAA"))); //Line n4
        System.out.println(list); // [AAA, BBB, AAA] StringBuilder does not override its equals method

        List<String> list2 = new ArrayList<>();
        list2.add(new String("AAA")); //Line n4
        list2.add(new String("BBB")); //Line n5
        list2.add(new String("AAA")); //Line n6

        list2.removeIf(sb -> sb.equals(new String("AAA"))); //Line n4
        System.out.println(list2); //[BBB] String does override its equals method
    }
}
/*
    ArrayList instance referred by 'list' stores 3 StringBuilder instances.

    removeIf(Predicate<? super E> filter) method was added as a default method in Collection<E> interface in JDK 8 and
    it removes all the elements of this collection that satisfy the given predicate.

    StringBuilder class doesn't override equals(Object) method. So Object version is invoked, which uses == operator,
    hence `sb.equals(new StringBuilder("AAA"))` would return false as all 4 StringBuilder instances have been created
    at four different memory locations.

    None of the StringBuilder instances are removed from the list.

    StringBuilder class overrides toString() method, which returns the containing String and that is why [AAA, BBB, AAA]
    will be printed on to the console.
 */