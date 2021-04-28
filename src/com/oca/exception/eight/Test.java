package com.oca.exception.eight;

class Test {

    private static void m1() throws Exception { // checked exception

        throw new Exception();
    }

    public static void main(String[] args) { // main method must either declare or handle exception

        try {
//            m1();
        } finally {
            System.out.println("A");
        }
    }
}
/*
    Method m1() throws Exception (checked) and it declares to throw it, so no issues with method m1().

    But main() method neither provides catch handler nor throws clause and hence main method gives Compilation error.

    Handle or Declare rule should be followed for checked exception if you are not re-throwing it.
 */