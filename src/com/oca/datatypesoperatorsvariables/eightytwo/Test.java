package com.oca.datatypesoperatorsvariables.eightytwo;

class Test {

    public static void main(String[] args) {

        howMany(true, new boolean[2]);  // 2
        howMany(true, true, true);  // 2
//        howMany(true, {true, true}); /* compilation error, as varargs should not be initialized in that form. */
        howMany(true, new boolean[] {true, true});  // 2
    }

    public static int howMany(boolean b, boolean... b2) {

        System.out.println("vararg= " + b2.length);
        return b2.length;
    }
}
