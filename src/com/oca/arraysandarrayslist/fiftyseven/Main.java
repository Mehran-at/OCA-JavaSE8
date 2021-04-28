package com.oca.arraysandarrayslist.fiftyseven;

class Main {

    public static void main(String[] args) {

        boolean flag = false;
        do {
            if (flag = !flag) { //Line n1 //First iteration True, Second iteration False
                System.out.print(1); //Line n2
                continue; //Line n3
            }
            System.out.print(2); //Line n4 /* It's possible to have a statement in between do scopes and while , hence
            // no compilation error here. */
        } while (flag); //Line n5
    }
}
/*
    Body of do in do-while loop is executed first and then condition is checked for the next iteration.

    Initially, flag = false;

    1st iteration: Boolean expression of if-block `flag = !flag` = `flag = !false` = `flag = true`: it assigns true to
    variable 'flag' and evaluates to true as well. Line n2 is executed and 1 is printed on to the console. Line n3 takes
    the control to the boolean expression of Line n5.

    2nd iteration: As flag is true, boolean expression at Line n5 evaluates to true and control enters the loop's body.
    Boolean expression of if-block `flag = !flag` = `flag = !true` = `flag = false`: it assigns false to variable 'flag'
    and evaluates to false as well. Line n2 and Line n3 are not executed. Line n4 is executed, which prints 2 on to the
    console. Control goes to the boolean expression of Line n5.

    3rd iteration: As flag is false, boolean expression at Line n5 evaluates to false and control exits the loop.

    Program terminates successfully after printing 12 on to the console.
 */