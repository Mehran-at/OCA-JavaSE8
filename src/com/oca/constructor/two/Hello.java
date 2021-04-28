package com.oca.constructor.two;

class Hello {

    String msg = null;

    public Hello() {

        this("Good Morning!");
    }

    public Hello(String str) {

        msg = str;
    }

    public static void main(String[] args) {

        Hello localVarOne = new Hello();
        Hello localVarTwo = new Hello("Good Evening!");
        localVarOne.display();
        localVarTwo.display();
    }

    public void display() {

        System.out.println(msg);
    }
}
/*
    Hello localVarOne = new Hello(); invokes no-arg constructor.

    No-arg constructor calls parameterized constructor with the argument "Good Morning!"

    Parameterized constructor assigns "Good Morning!" to msg variable of the object referred by localVarOne.

    Hello localVarTwo = new Hello("Good Evening!"); invokes parameterized constructor, which assigns "Good Evening!" to
    msg variable of the object referred by localVarTwo.

    localVarOne.display(); prints Good Morning!

    localVarTwo.display(); prints Good Evening!
 */