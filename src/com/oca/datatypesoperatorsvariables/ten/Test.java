package com.oca.datatypesoperatorsvariables.ten;

class Test {

    public static void main(String[] args) {

        String ta = "A ";
        ta = ta.concat("B "); /* ta = "A B "*/
        String tb = "C "; /*A tb = "C "*/
        ta = ta.concat(tb); /* ta = "A B C "*/
        ta.replace('C', 'D'); /* result is ignored.*/
        ta = ta.concat(tb); /*A B D C */ /* ta = "A B C C "*/
        System.out.println(ta); /*A B C C */
    }
}
