package com.oca.datatypesoperatorsvariables.fourteenth;

class Test {

    //     int count;
    static int count;
    int countNonStatic;

    // static method can only access static instance com.oca.variables
    public static void displayMsg() {

        count++;
        System.out.println("static Var in static method " + count);
    }

    // instance method can access static instance variables
    public void displayMsg2() {

        count++;
        countNonStatic++;
        System.out.println("static var from instance method " + count);
        System.out.println("non-static var from instance method " + countNonStatic);
    }

    public static void main(String[] args) {

        Test.displayMsg();
        Test.displayMsg();

        Test testVar = new Test();
        testVar.displayMsg2();
        testVar.displayMsg2();
    }
}
