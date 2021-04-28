package com.oca.exception.twelve;

class C {

    private void print() {

        A a = new B();
//        private String msg = "hello"; // local variable can not get private access modifier, but only final non-access modifier.
        System.out.println(/* a.msg */);
    }
}
/*
    Method declaring checked exception in its throws clause doesn't mean that it should have code to actually throw that
    type of Exceptions.

    So even though read() method of Class1 declares to throw FileNotFoundException but its body doesn't actually throw
    an instance of FileNotFoundException.

    Variable and method name can be same as class name, so code of Class2 is also valid.

    Remember: Though you don't get any compilation error but it is not recommended to use the Class name for variable
    and method names.

    LOCAL variable can be declared with final modifier only.

    msg variable inside print() method of Class3 is declared private and this also causes compilation error.
 */