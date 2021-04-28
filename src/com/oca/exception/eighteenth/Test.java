package com.oca.exception.eighteenth;

class Test {

    private static void div(int i, int j) {

        try {
            System.out.println(i / j);
        } catch (ArithmeticException e) { // ArithmeticException is an unchecked exception(RuntimeException)
            Exception ex = new Exception(e);
//            throw ex; // ex is noe a checked exception and checked exception needs to be declared or handled
        }
    }

    public static void main(String[] args) {

        try {
            div(5, 0);
        } catch (Exception e) {
            System.out.println("END");
        }
    }
}
/*
    throw ex; causes compilation error as div method doesn't declare to throw Exception (checked) type. And java does not
    anymore recognize that ex is from ArithmeticException, as we created ex = new Exception(e);
 */
