package com.oca.inheritance.thirtynine;

class B {

    public static void evaluate(A t) { //Line n5
        t = new A(); //Line n6
        t.name = "PHISHING"; //Line n7
    }

    public static void main(String[] args) {

        A obj = new A(); //Line n1
        obj.print(); //Line n2. VIRUS
        evaluate(obj); //Line n3. I create a new A object so no change to obj
        obj.print(); //Line n4. VIRUS
    }
}
/*
    A class doesn't specify any constructor, hence Java compiler adds below default constructor:

    A() {super();}

    Line n1 creates an instance of A class and initializes instance variable 'name' to "VIRUS". Variable 'obj'
    refers to this instance.

    Line n2 prints VIRUS on to the console.

    Line n3 invokes evaluate(A) method, as it is a static method defined in B class, hence `evaluate(obj);`
     is the correct syntax to invoke it. Line n3 compiles successfully. On invocation parameter variable 't' copies the
     content of variable 'obj' (which stores the address to A instance created at Line n1). 't' also refers to the
     same instance referred by 'obj'.

    On execution of Line n6, another A instance is created, its instance variable 'name' refers to "VIRUS" and 't'
    starts referring to this newly created instance of A class. Variable 'obj' of main(String[]) method still refers
    to the A instance created at Line n1. So, 'obj' and 't' now refer to different A instances.

    Line n7, assigns "PHISHING" to the 'name' variable of the instance referred by 't'. evaluate(A) method finishes
    its execution and control goes back to main(String[]) method.

    Line n4 is executed next, print() method is invoked on the 'obj' reference and as obj.msg still refers to "VIRUS",
    so this statement prints VIRUS on to the console.

    Hence in the output, you get:

    VIRUS
    VIRUS
 */