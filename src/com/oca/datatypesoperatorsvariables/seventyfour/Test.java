package com.oca.datatypesoperatorsvariables.seventyfour;

class Test {

    static String STR = "KEEP IT "; //Line n1

    public static void main(String[] args) {

        String str = /* str + */ "REAL"; //Line n2
        System.out.println(str);
    }
}
/*
    At Line n2, local variable 'str' shadows the static variable 'str' created at Line n1. Hence, for the expression
    `str + "REAL"`, Java compiler complains as local variable 'str' is not initialized.
 */