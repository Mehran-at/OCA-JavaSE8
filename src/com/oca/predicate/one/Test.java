package com.oca.predicate.one;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Test {

    public static void checkAge(List<Person> list, Predicate<Person> predicate) {

        for (Person p : list) {
            if (predicate.test(p)) {
                System.out.println(p.name + " ");
            }
        }
    }

    public static void main(String[] args) {

        List<Person> iList = Arrays.asList(
                new Person("Hank", 45), new Person("Charlie", 40), new Person("Smith", 38));

        checkAge(iList, (Person p) -> p.getAge() > 40);
        checkAge(iList, (Person p) -> {return p.getAge() > 40;});
        checkAge(iList, p -> p.getName().equals("Smith"));
        checkAge(iList, p -> {return p.getName().equals("Smith");});
        checkAge(iList, (p) -> {return p.getName().equals("Smith");});
        checkAge(iList, (Person p) -> {return p.getName().equals("Smith");});
    }
}
