package com.oca.inheritance.fiftyeight;

class Test {

    public static void main(String[] args) {

        C gc = new C();
        System.out.println(((A) (B) gc).quote);
        System.out.println(((A) gc).quote);
    }
}
// Print "MONEY MONEY MONEY"
/*
    As instance variables are hidden by subclasses and not overridden, therefore instance variable can be accessed by
    using explicit casting.

    Let's check all the options one by one:

    gc.quote => It refers to "PLAY PLAY PLAY" as gc is of GrandChild class.

    (Parent)gc.quote => gc.quote will be evaluated first as dot (.) operator has higher precedence than cast. gc.quote
    refers to String, hence it cannot be casted to Parent type. This would cause compilation error.

    ((Parent)gc).quote => Variable 'gc' is casted to Parent type, so this expression refers to "MONEY DOESN'T GROW ON
    TREES". It is one of the correct options.

    ((Parent)(Child)gc).quote => 'gc' is of GrandChild type, it is first casted to Child and then to Parent type and
    finally quote variable is accessed, so this expression refers to "MONEY DOESN'T GROW ON TREES". It is also one of
    the correct options.

    (Parent)(Child)gc.quote => gc.quote will be evaluated first as dot (.) operator has higher precedence than
    cast. gc.quote refers to String, hence it cannot be casted to Child type. This would cause compilation error.
 */