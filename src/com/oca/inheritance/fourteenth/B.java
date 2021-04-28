package com.oca.inheritance.fourteenth;

class B implements A {

    /*protected access modifier cause compiler error as its more restricted as the method's access modifier is not in interface*/
    public void export() {

        System.out.println("Tool::export"); //n1
    }
}
