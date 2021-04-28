package com.oca.inheritance.fiftyseven;

class Test {

    public static void main(String[] args) {

        A paper = new B(); //Line n3
        System.out.println(paper.getType()); //Line n4
    }
}
/*
    Instance method of subclass cannot override the static method of superclass.

    Instance method at Line n2 tries to override the static method at Line n1 and hence Line n2 causes compilation error.

    There is no issue with Line n3 as reference variable of superclass can refer to an instance of subclass.

    At Line n4, paper.getType() doesn't cause compilation error but as this syntax creates confusion, so it is not a
    good practice to access the static variables or static methods using reference variable, instead class name should
    be used. Paper.getType() is the preferred syntax.
 */