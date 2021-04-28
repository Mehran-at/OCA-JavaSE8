package com.oca.inheritance.twentytwo;

import java.io.FileNotFoundException;
import java.io.IOException;

class SubClass extends SuperClass {

    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}
