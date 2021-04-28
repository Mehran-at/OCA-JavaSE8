package com.oca.inheritance.twentyfive;

class Main /*extends String*/ {

    public static void main(String[] args) {

        Main obj = new Main();
        System.out.println(obj);
    }

    @Override
    public String toString() {

        return "TEST";
    }
}
// String is a final class so it cannot be extended.