package com.oca.datatypesoperatorsvariables.seventyfive;

class Test {

    public static void main(String[] args) {

        boolean booleanState = true;
//        System.out.println(booleanState = false || booleanState = true | booleanState = false);
//        System.out.println(booleanState = false || booleanState = (true | booleanState) = false);
//        System.out.println(booleanState = false || booleanState = ((true) = false));
        System.out.println(booleanState);
    }
}
/*
    First group the operators first according to their presence:

    System.out.println(status = false || status = (true | status) = false); //Bitwise inclusive OR | has highest
    precedence over logical or (||) and assignment (=).

    For assignment operator to work, left operand must be variable but in above case, `(true | booleanState) = false`
    causes compilation failure as left operand (true | status) evaluates to a boolean value and not boolean variable.
 */