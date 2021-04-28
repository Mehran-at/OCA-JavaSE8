package com.oca.datatypesoperatorsvariables.twentythree;

class Test {

    public static void main(String[] args) {

        double price = 90000;
//        String model;
        String model = null;
        if (price > 100000) {
            model = "Tesla Model X";
        } else if (price <= 100000) {
            model = "Tesla Model S";
        }
        System.out.println(model); /* If model was not assigned to null at line 9, we would get compilation error here
        as  codes in if and else-if block might never be executed */
    }
}
