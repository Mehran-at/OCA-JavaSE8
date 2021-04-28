package com.oca.inheritance.fourtysix;

class Test {

    public static void main(String[] args) {

        Sub obj = new Sub(); // Line n4
        System.out.println(obj.var); // Line n5
        System.out.println(obj.getVar());
    }
}
//  Which three modifications, done independently, print 1000 on to the console?
/*
    Subclass overrides the methods of superclass but it hides the variables of superclass.

    Line n2 hides the variable created at Line n1, there is no rules related to hiding (type and access modifier can
    be changed).

    Line n5 causes compilation error as obj is of Sub type and 'var' is declared private in Sub class. Variable 'var'
    of Sub class cannot be accessed outside the Sub class.

    Let's check all the options one by one:

    'Change Line n1 to private int var = 1000;' => It will not rectify the existing error of Line n5, in fact after this
    change, Line n3 will also cause compilation error.

    'Delete the Line n2' => After deleting this line, obj.var at Line n5 will refer to variable 'var' of Super class.
    Hence, output will be 1000 in this case.

    'Change Line n3 to return var;' => This will have no effect to the output of the code, as getVar() method has not
    been invoked.

    'Change Line n4 to Super obj = new Sub();' => After this modification, obj becomes Super type, hence obj.var
    will refer to variable 'var' of Super class. Hence, output will be 1000 in this case.

    'Delete the method getVar() from the Sub class' => This will have no effect to the output of the code, as getVar()
    method has not been invoked.

    'Change Line n5 to System.out.println(obj.getVar());' => obj.getVar() will invoke the getVar() method of Sub class
    and this method returns the variable value from Super class (super.var). Hence, output will be 1000 in this case.
 */