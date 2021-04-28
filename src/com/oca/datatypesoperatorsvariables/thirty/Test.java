package com.oca.datatypesoperatorsvariables.thirty;

class Test {

    public static void main(String[] args) {

        Pic p1 = new Pic();
        p1.x = 18;
        p1.y = 38;
        p1.z = -1;

        Pic p2 = new Pic();
        p2.x = 89;
        p2.y = 80;
        p2.z = 01;

        System.out.println(p1); // Pic{89, 38, -1}
        System.out.println(p2); // Pic{89, 80, 01}
    }
}
