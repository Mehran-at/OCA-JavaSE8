package com.oca.datatypesoperatorsvariables.twenty;

class Test {

    public static void main(String[] args) {

        float flt = 100F;
        float flt1 = (float) 1_11.00;
        float flt2 = 100; /* primitive float type if gets decimal, like 100.0, then (f) must be added at the end of number(100.0f).
         Otherwise it cause compilation error. */
        Float flt5 = 100f;
        double y1 = 203.22;
//        float flt3= y1; /* compiler error. */
        int y2 = 100;
        float flt4 = y2;

        float x1 = 100.00f;
        double x2 = x1;
    }
}
// double can refer to a float, but float can not refer to a double. Cause we loose precision.