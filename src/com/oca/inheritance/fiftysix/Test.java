package com.oca.inheritance.fiftysix;

class Test {

    public static void main(String[] args) {

        A b = new A(); // 1001
        A A = new B(); //Line n9. -1
        B d = new B(); // -1
    }
    // Important point.
}
/*
    Method can have same name as that of the Class. Hence, void A() is a valid method declaration in A class.

    Line n2 invokes the A() method and not the constructor.

    Subclass overrides the methods of superclass but it hides the variables of superclass.

    Line n5 hides the variable created at Line n1, there is no rules related to hiding (type and access modifier can be
    changed).

    Line n7 correctly overrides the A() method of class A.

    Compiler adds super(); as the 1st statement inside the no-argument constructor of A class and B class.

    There is no compilation error, so let's check the execution.

    new B() at Line n9 invokes the constructor of B class, at this point instance variable id is declared
    and 0 is assigned to it. In fact, instance variable id of A class is also declared and 0 is assigned to it.
    Compiler added super(); as the first statement inside this constructor, hence control goes to the no-argument
    constructor of A class.

    Compiler added super(); as the first statement inside this constructor as well, hence it invokes the no-argument
    constructor of the Object class. No-argument constructor of Object class finishes its execution and control goes
    back to the constructor of A class. Before it starts executing remaining statements inside the constructor,
    instance variable assignment statement (if available) are executed. This means 1000 is assigned to variable id of
    A class.

    Line n2 is executed next, A() method defined in B class is executed. Which overriding method to invoke,
    is decided at runtime Ad on the instance. Instance is of B class (because of Line n9), hence control starts
    executing A() method of B class.

    Line n8 is executed next, B class hides the id variable of A class and that is why at Line n8, id points
    to variable created at Line n5. This id variable still stores the value 0 as A class's constructor has not
    finishes its execution.

    value of id is decremented by 1, so id becomes -1 and -1 is printed on to the console. A() method finishes its
    execution and control goes back to Line n2. No-argument constructor of A class finishes its execution and control
    goes back to the constructor of B class. Before it starts executing remaining statements inside the
    constructor, instance variable assignment statement (if available) are executed. This means 2000 is assigned to
    variable id of B class.

    No-argument constructor of B class finishes its execution and control goes back to Line n9. main(String [])
    method finishes its execution and program terminates successfully.

    Hence, output is -1.
 */