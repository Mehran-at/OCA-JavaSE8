package com.oca.predicate.five;

import java.util.function.Predicate;

class Main {

    public static void main(String[] args) {

        String[] strings = {"*", "**", "***", "****", "*****"};
//        Predicate pr1 = s -> s.length(); /* cause compilation error. */
//        Predicate<String> s = s -> s.length() < 4;
//        extracted(strings , pr1);
        extracted(strings , s -> s.length() < 4);
    }

    private static void extracted(String[] arr, Predicate<String> predicate) {

        for (String str : arr) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
/*
    Though Predicate is a generic interface but raw type is also allowed. Type of the variable in lambda expression is
    inferred by the generic type of Predicate<T> interface.

    In this case, Predicate pr1 = s -> s.length() < 4; Predicate is considered of Object type so variable "s" is of
    Object type and Object class doesn't have length() method. So, s.length() causes compilation error.
 */
