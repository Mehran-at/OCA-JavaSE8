package com.oca.loop.nineteenth;

class Main {

    public static void main(String[] args) {

        do {
            System.out.println(100);
        } while (true);

//        System.out.println("Bye");
    }
}
/*
    Boolean expression of do-while loop uses literal true (compile-time constant), hence Java compiler knows that this
    loop is an infinte loop.

    It also knows that once at runtime Java Control enters an infinite loop, none of the statements after loop block
    will get executed.

    Hence it marks all the codes after infinite loop as Unreachable Code, which results in compilation error.

    If boolean variable was used instead of boolean literal, then this program would have compiled and executed
    successfully.
    ------------------------------------------------------
    public class DoWhileTest1 {
        public static void main(String[] args) {
            boolean flag = true;
            do {
                System.out.println(100);
            } while (flag);

            System.out.println("Bye");
        }
    }
    -------------------------------------------------------
 */