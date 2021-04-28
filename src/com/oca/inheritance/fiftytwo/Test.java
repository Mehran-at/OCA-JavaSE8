package com.oca.inheritance.fiftytwo;

class Test {

    public static void main(String[] args) {

        A a = new B();
        /*INSERT*/
        ((C)a).ride("EMMA");
        ((C)(B)a).ride("EMMA");
        ((B)a).ride("EMMA");
    }
}
/*
    Let's check all the options one by one:

    a.ride("EMMA"); ✗ Variable 'a' is of A type and ride(String) method is not defined in A class,
    therefore it causes compilation error.

    (a)a.ride("EMMA"); ✗ a.ride("EMMA") will be evaluated first as dot (.) operator has higher precedence than
    cast. a.ride("EMMA") returns void, hence it cannot be casted to a type. This would cause compilation error.

    ((C)a).ride("Emma"); ✓ Variable 'a' refers to an instance of a type and variable 'a' is casted to
    C type. C class has ride(String) method, hence no compilation error. ride(String) method of a class will get
    invoked at runtime and will print the expected output. As, name.toUpperCase() method is invoked, hence it doesn't matter
    in what case you pass the name, in the output name will always be displayed in the upper case.

    (B)a.ride("emma"); ✗ a.ride("EMMA") will be evaluated first as dot (.) operator has higher precedence
    than cast. a.ride("EMMA") returns void, hence it cannot be casted to B type. This would cause compilation
    error.

    ((B)a).ride("emma"); ✓ Variable 'a' refers to an instance of a type and variable 'a' is casted
    to B type (super type of a). B interface has ride(String) method, hence no
    compilation error. ride(String) method of a class will get invoked at runtime and will print the expected output.

    (B)(a)a.ride("EMMA"); ✗ a.ride("EMMA") will be evaluated first as dot (.) operator has higher
    precedence than cast. a.ride("EMMA") returns void, hence it cannot be casted to a type. This would cause
    compilation error.

    (a)(B)a.ride("EMMA"); ✗ a.ride("EMMA") will be evaluated first as dot (.) operator has higher
    precedence than cast. a.ride("EMMA") returns void, hence it cannot be casted to B type. This would cause
    compilation error.

    ((B)(a)a).ride("EMMA"); ✓ Variable 'a' refers to an instance of a type, it is first casted to
    a type and then casted to B type. B interface has ride(String) method, hence no
    compilation error. ride(String) method of a class will get invoked at runtime and will print the expected output.

    ((a)(B)a).ride("emma"); ✓ Variable 'a' refers to an instance of a type, it is first casted to
    B type and then casted to a type. a class has ride(String) method, hence no compilation error. ride(String)
    method of a class will get invoked at runtime and will print the expected output.
 */