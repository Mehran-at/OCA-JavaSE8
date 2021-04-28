package com.oca.datatypesoperatorsvariables.fiftythree;

class Test {

    static double area;
    double bb;

    public static void main(String[] args) {

        Test t = new Test();
        t.bb = 11;
        t.i(); /*Static method can call instance method via object reference. */
//      i(); /* Non-static method can not be called from static method. */

        double p, b, h;
        if (area == 0) {
            b = 3;
            h = 4;
            p = 0.5;
            area = p * b * h;
        }
        System.out.println("Area is " + area);
//        System.out.println(p + b + h); /* Cause computation error, bcs these variables were not initialized. */
    }

    public void i() {

        area = 12;
        bb = 10;
    }
}
