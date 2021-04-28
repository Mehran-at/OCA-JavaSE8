package com.oca.arraysandarrayslist.fourtytwo;

import java.util.ArrayList;
import java.util.List;

class Test {

    public static void main(String[] args) {

        List<StringBuilder> yummy = new ArrayList<>();
        yummy.add(new StringBuilder("Watermelon"));
        yummy.add(new StringBuilder("Apple"));
        yummy.add(new StringBuilder("Avocado"));
        yummy.add(new StringBuilder("Banana"));
        yummy.add(new StringBuilder("Peach"));

        for (int i = 0 ; i < yummy.size() ; i++) {
            if (i == 0) {
                yummy.remove(new StringBuilder("Avocado"));
            }
        }

        System.out.println(yummy);



        List<Integer> numbers = new ArrayList<>();
        numbers.add(new Integer(1));
        numbers.add(new Integer(2));
        numbers.add(new Integer(3));
        numbers.add(new Integer(4));
        numbers.add(new Integer(5));

        for (int i = 0 ; i < numbers.size() ; i++) {
            if (i == 2) {
                numbers.remove(new Integer(2));
            }
        }

        System.out.println(numbers);
    }
}
/*
    In this class, we try to remove an item from the list while iterating using standard for loop so you might think that
     it would throw java.util.ConcurrentModificationException.

    But java.util.ConcurrentModificationException will never be thrown for standard for loop but only
    enhanced(for each loop) or while using Iterator/ListIterator.

    In this case yummy.remove(new StringBuilder("Avocado")); will never remove any items from the list as
    StringBuilder class doesn't override the equals(Object) method of Object class.

    StringBuilder instances created at "yummy.add(new StringBuilder("Avocado"));" and
    "yummy.remove(new StringBuilder("Avocado"));" are at different memory locations and equals(Object) method returns
    false for these instances.

    Whereas the numbers list, Integer class do override equals(Object) method in Object class, and for that reason, i==2
    returns true and 2 will be deleted from numbers list
 */