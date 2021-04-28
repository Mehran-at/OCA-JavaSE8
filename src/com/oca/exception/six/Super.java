package com.oca.exception.six;

import java.io.IOException;

abstract class Super {

    abstract void m1() throws IOException; /* So we have interface method which throws checked exception, so we
    have to follow the rules of overriding implemented methods with checked exceptions. */
}