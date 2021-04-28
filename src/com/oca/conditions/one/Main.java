package com.oca.conditions.one;

class Main {

    public static void main(String[] args) {

        int grade = 75;
        if (grade > 65)
            System.out.println("Yohooooo");
//      System.out.println("I passed"); // Between if-else blocks, can't be any statements.
        else
            System.out.println("You failed");
    }
}
/*
    There should not be anything between if-else block but in this case, System.out.println("You passed"); is between
    if-else and thus Compilation error.
 */
