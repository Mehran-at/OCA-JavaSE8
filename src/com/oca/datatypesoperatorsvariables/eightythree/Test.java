package com.oca.datatypesoperatorsvariables.eightythree;

class Test {

    public static void main(String[] args) {

        int x2 = 1, y2 = 15;
        while (x2 < 10)
            y2--;       // This does change the value of y2, but it's irrelevant to loop's boolean condition.
        x2++;           // The value of x2 will never get a chance to change, as it's not in the scope of while loop.

        System.out.println(x2 + ", " + y2);
    }
}
