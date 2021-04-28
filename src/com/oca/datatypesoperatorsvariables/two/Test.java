package com.oca.datatypesoperatorsvariables.two;

class Test {

    public static void main(String[] args) {

        Short s1 = 200;
        Integer s2 = 400;
//        s1 = s2; /* compilation error */
        //Short can be casted to long & Integer will be automatically cast to Long
        Long s3 = (long) s1 + s2;
        //Integer or Long cannot be casted to String
//        String s4 = (String) (s3 * s2);
        System.out.println("Sum is: " /* s4 */);
    }
}
