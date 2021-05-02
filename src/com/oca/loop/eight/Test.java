package com.oca.loop.eight;

class Test {

    public static void main(String[] args) {

        do {
            System.out.println("Good");
//        } while (true); // cause compiler error as code status on line 11 will be unreachable.
        } while (false);
        System.out.println("Bye");
    }
}
