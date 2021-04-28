package com.oca.datatypesoperatorsvariables.seventythree;

class Test {

    public static void main(String[] args) {

        String text = "Thumbs ";
        text = text + (text = "Up "); // Left operand of + operator is evaluated first. text = "Thumbs " + (text = "Up ");
        System.out.println(text); // Thumbs Up
    }
}