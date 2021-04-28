package com.oca.datatypesoperatorsvariables.thirteenth;

class Test {

    static int i;
    int j;

    public static void main(String[] args) {
        Test x1 = new Test();
        Test x2 = new Test();

        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;
        System.out.println(x1.i + " " + x1.j + " " + x2.i + " " + x2.j); // 5 4 5 6
    }
}
