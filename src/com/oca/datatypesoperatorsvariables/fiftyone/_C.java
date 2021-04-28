package com.oca.datatypesoperatorsvariables.fiftyone;

class _C {

    private static int $;
    private static String a_b;// Class variable

    public static void main(String[] args) {
        String a_b = null; /* If there is a local variable with same name as its class variable, it will shadow the class
         variable even if it's static. Local variables will not be initialized to their default values and have to be
         initialized */
        System.out.println($);
        System.out.println(a_b);
        System.out.println(_C.a_b);
        System.out.println($ + a_b + _C.a_b);
    }
}
