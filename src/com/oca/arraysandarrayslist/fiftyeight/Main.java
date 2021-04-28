package com.oca.arraysandarrayslist.fiftyeight;

class Main {

    public static void main(String[] args) {

        ILogger[] loggers = new ILogger[2]; //Line n1
        for (ILogger logger : loggers)

            logger.log(); //Line n2
    }
}
/*
    Line n1 creates an array instance of ILogger containing 2 elements. Null is assigned to both the array elements.
    Line n1 compiles successfully.

    As, log() method is declared in ILogger interface, hence statement at Line n2: logger.log(); doesn't cause any
    compilation error. Compiler is happy to see that log() method is invoked on the reference variable of ILogger type.

    1st iteration:

    logger --> null, logger.log(); throws NullPointerException as method log() is invoked on null reference.
 */