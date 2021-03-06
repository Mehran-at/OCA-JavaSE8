package com.oca.constructor.nine;

class Test {

    public static void main(String[] args) {

        Square sq1 = new Square(10); //Line n1
        Square sq2 = new Square(5); //Line n2
        sq1.setInner(sq2);                //Line n3
        System.out.println(sq1.sq.length); //Line n4
        System.out.println(sq1);
    }
}
/*
    As both the classes: Square and Test are in the same file, hence variables 'length' and 'sq' can be accessed
    using dot operator. Given code compiles successfully.

    Line n1 creates an instance of Square class and 'sq1' refers to it. sq1.length = 10 and sq1.sq = null.

    Line n2 creates an instance of Square class and 'sq2' refers to it. sq2.length = 5 and sq2.sq = null.

    On execution of Line n3, sq1.sq = sq2.

    Line n4: System.out.println(sq1.sq.length); => System.out.println(sq2.length); => Prints 5 on to the console.
 */
/*
    sq1 is:
        Square{length = 10, sq = null}

    sq2 is:
        Square{length = 5, sq = null}

    setInner
        {length = 5, sq = null}

    sq1 is:
        Square{length = 10, sq2{length = 5, sq = null}}
 */