package com.oca.exception.fourteenth;

class B {

    public static void main(String[] args) { //Line 10

//        A.print(); //Line 11. This lines needs to be handled and A method throw checked exception.
        //Line 12
        try {
            A.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
    This question is tricky as 2 changes are related and not independent. Let's first check the reason for compilation
    error. Line 5 throws a checked exception, IOException but it is not declared in the throws clause. So, print method
    should have throws clause for IOException or the classes in top hierarchy such as Exception or Throwable.

    Based on this deduction, Line 4 can be replaced with either "static void print() throws Exception {" or "static void
    print() throws Throwable" but we will have to select one out of these as after replacing Line 4, Line 11 will start
    giving compilation error as we are not handling the checked exception at Line 11.

    This part is easy, do we have other options, which mention "Throwable"? NO. Then mark the first option as "Replace
    Line 4 with static void print() throws Exception {".

    As, print() method throws Exception, so main method should handle Exception or its super type and not it's subtype.
    Two options working only with IOException can be ruled out.

    Multi-catch statement "catch(IOException | Exception e)" gives compilation error as IOException and Exception are
    related to each other in multilevel inheritance. So you are left with only one option to pair with our 1st choice:

    Surround Line 11 with below try-catch block:

    try {
        ReadTheFile.print();
    } catch(Exception e) {
        e.printStackTrace();
    }
 */