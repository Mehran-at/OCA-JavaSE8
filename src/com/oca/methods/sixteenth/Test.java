package com.oca.methods.sixteenth;

class Test {

    public static void main(String[] args) {

//        private int i = 100;
//        private int j = 200;
        int i = 100;
        int j = 200;
        R rect = new R(i, j);
        System.out.println(rect.getHeight() + ", " + rect.getWidth());
    }
}
/*
i and j cannot be declared private as i and j are local variables.

Only final modifier can be used with local variables.
 */