package com.oca.objectequality.seven;

class Main {

    public static void main(String[] args) {

        boolean flag1 = "Java" == "Java".replace('J', 'J'); //Line n1 replace(char oldChar, char newChar)
        boolean flag11 = "Java" == "Java".replace('J', 'V'); //Line n1 replace(char oldChar, char newChar)
        boolean flag111 = "Java" == "Java".replace('M', 'J'); //Line n1 replace(char oldChar, char newChar)

        boolean flag2 = "Java" == "Java".replace("J", "J"); //Line n2 replace(String oldString, String newString)
        boolean flag22 = "Java" == "Java".replace("J", "V"); //Line n2 replace(String oldString, String newString)
        boolean flag222 = "Java" == "Java".replace("M", "J"); //Line n2 replace(String oldString, String newString)

        System.out.println(flag1); // true
        System.out.println(flag11); // false
        System.out.println(flag111); // true
        System.out.println(flag2); // false
        System.out.println(flag22); // false
        System.out.println(flag222); // true
        System.out.println(flag1 && flag2); // false
        System.out.println(flag11 && flag22); // false
        System.out.println(flag111 && flag222); // true

        System.out.println("---------------------");
        boolean f1 = true;
        boolean f2 = true;
        boolean f3 = false;
        boolean f4 = false;
        System.out.println(f1 && f2);
        System.out.println(f3 && f4);
        System.out.println(f1 && f3);
        System.out.println(f3 && f1);
    }
}
/*
    String class has following two overloaded replace methods:

    1. public String replace(char oldChar, char newChar) {}:

    Returns a string resulting from replacing all occurrences of oldChar in this string with newChar. If no replacement
    is done, then source String object is returned. e.g.

    "Java".replace('a', 'A') --> returns new String object "JAvA".

    "Java".replace('a', 'a') --> returns the source String object "Java" (no change).

    "Java".replace('m', 'M') --> returns the source String object "Java" (no change).


    2. public String replace(CharSequence target, CharSequence replacement) {}:

    Returns a new String object after replacing each substring of this string that matches the literal target sequence
    with the specified literal replacement sequence. e.g.

    "Java".replace("a", "A") --> returns new String object "JAvA".

    "Java".replace("a", "a") --> returns new String object "Java" (it replaces "a" with "a").

    "Java".replace("m", "M") --> returns the source String object "Java" (no change).



    For Line n1, as both oldChar and newChar are same, hence source String ("Java") is returned by
    `"Java".replace('J', 'J');` without any change. flag1 stores true.

    For Line n2, even though target and replacement are same but as "J" is found in the source String, hence a new
    String object "Java" is returned by `"Java".replace("J", "J");` after replacing "J" with "J". flag2 stores false.

    flag1 && flag2 evaluates to false.
 */