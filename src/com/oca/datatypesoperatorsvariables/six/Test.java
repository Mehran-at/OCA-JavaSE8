package com.oca.datatypesoperatorsvariables.six;

class Test {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("JavaOCA");
        String s1 = sb.toString();/* toString() method defined in StringBuilder class doesn't use
        String literal rather uses the constructor of String class to create the instance of String class. */
        String s2 = sb.toString();
//        String s2 = sb; /* cause compilation error, as StringBuilder is not of String type. */

        System.out.println(s1 == s2); // false
    }
}
/*
    So both s1 and s2 refer to different String instances even though their contents are same.
 */