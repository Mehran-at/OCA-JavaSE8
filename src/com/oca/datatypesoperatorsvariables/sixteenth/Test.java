package com.oca.datatypesoperatorsvariables.sixteenth;

class Test {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("eLion");
        String ejg = null;
        ejg = sb1.append("X").substring(sb1.indexOf("L"), sb1.indexOf("X")); // eLionX  sub.(1, 5)= LionX
        System.out.println(sb1); // eLionX
        System.out.println(ejg); // LionX
    }
}