package com.oca.datatypesoperatorsvariables.nineteenth;

class Test {

    public static void main(String[] args) {

        Boolean[] x = new Boolean[2];
        x[0] = new Boolean(Boolean.parseBoolean("true"));
        x[1] = new Boolean(null); // Anything except true or string value(upper/lowercase) of true, is false.
        System.out.println(x[0] + " " + x[1]);
    }
}
