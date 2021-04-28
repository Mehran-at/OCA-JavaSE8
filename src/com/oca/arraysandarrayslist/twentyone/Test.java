package com.oca.arraysandarrayslist.twentyone;

import java.util.ArrayList;
import java.util.List;

class Test {

    public static void main(String[] args) {

        List<Character> list = new ArrayList<>();
        list.add(0, 'V');// ['V']
        list.add('T');                // ['V', 'T']
        list.add(1, 'E');// ['V', 'E', 'T']
        list.add(3, 'O');// ['V', 'E', 'T', 'O']


        if (list.contains('O')) {// true
            Character o = list.remove('O');/* list.remove get the int value of 'O' is 79, and this cause
            IndexOutOfBoundsException as it exceeds the size of ArrayList which is 4. */
            Character o1 = list.remove(0);
        }

        for (char ch : list) {
            System.out.print(ch);
        }
    }
}
/*
    list.add(0, 'V'); => char 'V' is converted to Character object and stored as the first element in the list. list --> [V].

    list.add('T'); => char 'T' is auto-boxed to Character object and stored at the end of the list. list --> [V,T].

    list.add(1, 'E'); => char 'E' is auto-boxed to Character object and inserted at index 1 of the list, this shifts T
    to the right. list --> [V,E,T].

    list.add(3, 'O'); => char 'O' is auto-boxed to Character object and added at index 3 of the list. list --> [V,E,T,O].

    list.contains('O') => char 'O' is auto-boxed to Character object and as Character class overrides equals(String)
    method this expression returns true. Control goes inside if-block and executes: list.remove('O');.

    remove method is overloaded: remove(int) and remove(Object). char can be easily assigned to int so compiler tags
    remove(int) method. list.remove(<ASCCI value of 'O'>); ASCCI value of 'O' is 97 so ASCII value of 'O' will be more
    than 4.

    list.remove('O') throws runtime exception, as it tries to remove an item from the index greater than 3 but allowed
    index is 0 to 3 only.
 */
