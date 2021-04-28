package com.oca.inheritance.fourtyone;

abstract class B extends A {

    /*INSERT*/
//    abstract void travel(); /* this is just an overloaded method for the travel(String) method in A */

//    abstract void travel(String beach); /* This is a correct  method override for travel(String) method in A */

//    public abstract void travel();/* this is just an overloaded method for the travel(String) method in A */

//    public void travel() throws RuntimeException { /* this is just an overloaded method for the travel(String) method in A */
//
//    }

//    public void travel(String beach) throws Exception {} /* causes compiler errors as travel(String) method in A does 
//    not declare to throw an checked exception */
    
//    void travel(String beach) throws java.io.IOException {} /* causes compiler errors as travel(String) method in A does 
////    not declare to throw an checked exception */

    public void travel(Object obj) { /* this is just an overloaded method for the travel(String) method in A */

    }
}
/*
    Both A and B are abstract classes and B extends A. It is possible to have
    abstract class without any abstract method. Code as is compiles successfully as B inherits travel(String)
    method of A class.

    But as per the question, INSERT must be replaced such that there is no compilation error.

            Let's check all the options one by one:

    abstract void travel(); ✓ This is method overloading. B has 2 methods: `void travel(String){}`
    and `abstract void travel()`.

    abstract void travel(String beach); ✓ As B is abstract, hence travel(String) method can be declared
    abstract.

    public abstract void travel(); ✓ This is method overloading. B has 2 methods: `void travel(String){}`
    and `abstract void travel()`.

    public void travel() throws RuntimeException {}: ✓ This is method overloading. B has 2 methods: `void
    travel(String){}` and `public void travel() throws RuntimeException {}`.

    public void travel(String beach) throws Exception {}: ✗ As overridden method doesn't declare to throw any checked
    Exception hence overriding method is not allowed to declare to throw Exception.

        void travel(String beach) throws java.io.IOException {} ✗ As overridden method doesn't declare to throw any
        checked Exception hence overriding method is not allowed to declare to throw java.io.IOException.

    public void travel(Object obj) {} ✓ This is method overloading. B has 2 methods: `void
    travel(String){}` and `public void travel(Object){}`.
*/
