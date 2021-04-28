package com.oca.datatypesoperatorsvariables.sixtyfour;

class Test {

    public static void main(String[] args) {

        Profitable obj = new Business(); // Line n2
        System.out.println(obj.profitPercentage); /* Line n3. print 42.0 and it will get the value of variable from its
        object reference's class. */
        System.out.println(Profitable.profitPercentage); // Line n4. 42.0

        Business obj1 = new Business(); // Line n2
        System.out.println(obj1.profitPercentage); // print 42.0
    }
}
/*
    'profitPercentage' variable of Profitable interface is implicitly public, static and final.

    Line n1 defines the instance variable 'profitPercentage' of Business class. There is no error at Line n1.

    Super type reference variable can refer to an instance of Sub type, therefore no issues at Line n2 as well.

    Even though correct syntax for accessing interface variable is by using Interface name, such as
    Profitable.profitPercentage but reference variable also works. obj.profitPercentage doesn't cause any compilation
    error.

    As, obj is of Profitable type, hence obj.profitPercentage points to the 'profitPercentage' variable of
    Profitable type. Given code compiles successfully and on execution prints 42.0 on to the console.
 */