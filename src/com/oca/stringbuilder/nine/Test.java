package com.oca.stringbuilder.nine;

class Test {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";
        if (sb.toString().equals(s.toString())) // true
            System.out.println("Match 1"); // print Match 1
        else if (sb.equals(s)) // false because StringBuilder does not override its equal object method
            System.out.println("Match 2");
        else
            System.out.println("No Match!");
    }
}
