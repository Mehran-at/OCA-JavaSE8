package com.oca.datatypesoperatorsvariables.eight;

class Test {

    public static void main(String[] args) {

        int grade = 60;
//        if (grade = 60)
        if (grade == 60)
            System.out.println("You passed...");
        else
            System.out.println("You failed...");
    }
}
/*
    Following are allowed in boolean expression of if statement:

    1. Any expression whose result is either true or false. e.g. age > 20

    2. A boolean variable. e.g. flag

    3. A boolean literal: true or false

    4. A boolean assignment. e.g. flag = true

    boolean expression in this case is: (grade = 60), which is an int assignment and not boolean assignment.
    Hence Compilation error.
 */