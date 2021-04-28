package com.oca.datatypesoperatorsvariables.fifteenth;

class Test {

    public static void main(String[] args) {

        int a = 15;
        int b = 15;
        addToInt(a, b);
        System.out.println(a);
    }

    public static void addToInt(int x, int amountAdd) {

        x = x + amountAdd;
    }
}
