package com.oca.methods.three;

class StaticVariable {

    static int count;

    static {
        count = 0;
    }

    int i = 0;

    public static void main(String[] args) {

        StaticVariable staticVariable = new StaticVariable();
        StaticVariable staticVariable2 = new StaticVariable();
        staticVariable.changeCount();
        staticVariable2.changeCount();
        System.out.println(staticVariable.count + " : " + staticVariable2.count + " : " + staticVariable2.i);
    }

    // Here we see that instance methods can access static variables
    public void changeCount() {

        while (i < 5) {
            i++;
            count++;
        }
    }

}
