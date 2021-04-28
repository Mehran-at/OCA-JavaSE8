package com.oca.inheritance.thirtyfour;

class Main {

    public static void main(String[] args) {

        A p = new C(); //Line n1
        System.out.println(p.compute("Go")); //Line n2
        //GO
        //go
        //gogogo
    }
}
/*
    Class Q correctly overrides the compute(String) method of P class and class R correctly overrides the compute(String)
    method of Q class. Keyword super is used to invoke the method of parent class.

    At Line n1, reference variable 'p' refers to an instance of class R, hence p.compute("Go") invokes the compute(String)
    method of R class.

    return super.compute(str.replace('o', 'O')); => return super.compute("Go".replace('o', 'O')); => return
    super.compute("GO");

    It invokes the compute(String) method of Parent class, which is Q.

    => return super.compute(str.toLowerCase()); => return super.compute("GO".toLowerCase()); => return super.compute("go");

    It invokes the compute(String) method of Parent class, which is P.

    => return str + str + str; => return "gogogo";

    Control goes back to compute(String) method of Q and to the compute(String) method of R, which returns "gogogo".

    Line n2 prints gogogo on to the console.
 */