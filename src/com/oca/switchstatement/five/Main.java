package com.oca.switchstatement.five;

class Main {

    public static void main(String[] args) {

//        Boolean b = new Boolean("TRue");
        String b = new Boolean("TRue").toString();
        switch (b) {
//            case true: /* compilation error switch dont accept boolean */
//                System.out.println("1ONE");
//            case false:/* compilation error switch dont accept boolean */
//                System.out.println("2TWO");
            default:
                System.out.println("3THREE");
        }
    }
}
/*
    switch can accept primitive types: byte, short, int, char; wrapper types: Byte, Short, Integer, Character;
    String and enums.

    switch(b) causes compilation failure as b is of Boolean type.
 */