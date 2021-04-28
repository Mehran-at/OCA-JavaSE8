package com.oca.exception.one;

import java.io.IOException;

class X {

    public void print() throws IOException {

        throw new IOException("New Checked Exception was thrown");
    }
}

