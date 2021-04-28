package com.oca.inheritance.sixteenth;

class Test {

    public static void main(String[] args) {

        B dog1 = new B("Beagle");
        B dog2 = new B("Bubbly", "Poodle");
        System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" + dog2.getName() + ":" + dog2.getBreed());
        // name : Beagle : Bubbly : Poodle
    }

}
