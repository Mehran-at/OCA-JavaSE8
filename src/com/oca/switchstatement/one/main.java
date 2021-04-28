package com.oca.switchstatement.one;

class main {

    public static void main(String[] args) {
//        boolean opt = true; /*  cause compilation error as switch only accepts
//        char, byte, short, int, Character, Byte, Short, Integer, String, or an enum' */
        String opt = "true";
        switch (opt) {
            case "true":
                System.out.println("True");
                break;
            default:
                System.out.println("****");
        }
        System.out.println("Done");
    }
}
