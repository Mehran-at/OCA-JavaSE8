package com.oca.inheritance.fortyfour.three;

import com.oca.inheritance.fortyfour.one.Shrinkable;
import com.oca.inheritance.fortyfour.two.AntMan;

class Main {

    public static void main(String[] args) {

//        Shrinkable shrinkable = new AntMan();
//        shrinkable.shrinkPercentage();
//        AntMan.shrinkPercentage();
        Shrinkable.shrinkPercentage(); /* none of the up mentioned options work as interface's static methods can be
        only referred by classes name plus dot plus name of static method. */
    }
}
