package com.oca.inheritance.fourtyeight;

class C extends B {

    public void open() {

        /*INSERT*/
        super.open(); // it is not possible to directly reach the open() method in Lock class.
    }
}
