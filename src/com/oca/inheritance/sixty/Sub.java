package com.oca.inheritance.sixty;

import java.util.ArrayList;
import java.util.List;

abstract class Sub extends Super {

    /*INSERT*/
    abstract List<A> get() throws ArrayIndexOutOfBoundsException;

//    abstract List<B> get(); /* cause compilation error for non covariant return type */

//    abstract ArrayList<B> get(); /* cause compilation error for non covariant return type */

//    abstract ArrayList<A> get() throws Exception; /* cause compile error as overriden method throw runtime exception */
}
/*
    Few things to keep in mind:

    1.
    There are 2 rules related to return types of overriding method:

    A. If return type of overridden method is of primitive type, then overriding method should use same primitive type.

    B. If return type of overridden method is of reference type, then overriding method can use same reference type or
    its sub-type (also known as covariant return type).


    2.
    In case of overriding, if overridden method declares to throw any RuntimeException or Error, overriding method may or
    may not throw any RuntimeException but overriding method must not throw any checked exceptions.



    3.
    In generics syntax, Parameterized types are not polymorphic, this means even if B is subtype of A, List<B> is not
    subtype of List<A>. Remember this point. So below syntaxes are NOT allowed:

    List<A> list = new ArrayList<B>(); OR ArrayList<A> list = new ArrayList<B>();


    Let's check all the options one by one:

    - abstract List<A> get() throws ArrayIndexOutOfBoundsException; => ✓ It returns the same return type 'List<A>' and it is
    allowed to throw any RuntimeException (ArrayIndexOutOfBoundsException is RuntimeException)

    - abstract List<B> get(); => ✗ List<B> is not subtype of List<A>, it is not covariant return type.

    - abstract ArrayList<A> get() throws Exception; => ✗ As overridden method declares to throw IndexOutOfBoundsException,
    which is a Runtime Exception, overriding method is not allowed to declare to throw any checked Exception. Class
    Exception and its subclasses are checked exceptions.

    abstract ArrayList<B> get(); => ✗ ArrayList<B> is not subtype of List<A>, it is not covariant return type.
 */