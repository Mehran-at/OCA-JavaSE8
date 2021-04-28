package com.oca.datatypesoperatorsvariables.seventyseven;

class Test {

    public static void main(String[] args) {

        String place = "MiSSS";
        System.out.println(place.replace("SSS", "T")); // MiT
    }
}
/*
    replace(CharSequence target, CharSequence replacement) method of String class returns a new String object after
    replacing each substring of this string that matches the literal target sequence with the specified literal
    replacement sequence. The replacement proceeds from the beginning of the string to the end, for example,
    replacing "aa" with "b" in the string "aaa" will result in "ba" rather than "ab".
 */