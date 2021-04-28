package com.oca.inheritance.fourtynine;

class Test {

    public static void main(String[] args) {

        A s = new B();
        System.out.println(s.side + ":" + s.getSide());
    }
}
/*
    Subclass overrides the methods of superclass but it hides the variables of superclass.

    Line n3 hides the variable created at Line n1 and Line n4 overrides the getSide() method of Line n2. There is no
    compilation error for B class as it correctly overrides getSide() method. You can use any access modifier at
    Line n3 as well, there are no rules for variable hiding.

    's' is of A type, hence s.side equals to 0 and s.getSide() invokes overriding method of B class and it
    returns 4. Hence output is: 0:4.
 */