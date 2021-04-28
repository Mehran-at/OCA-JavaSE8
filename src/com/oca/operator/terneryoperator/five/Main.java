package com.oca.operator.terneryoperator.five;
class Main {

    public static void main(String[] args) {

        String[] arr = {"abc", "TrUe", "false", null, "FALSE"};
        for (String s : arr) {
            System.out.print(Boolean.valueOf(s) ? "T" : "F"); // F T F F F
        }
    }
}
/*
    Boolean.valueOf(String s) returns true if passed String argument is not null and is equal, ignoring case, to the
    String "true". In all other cases it returns false.

    Boolean.valueOf("abc") => false. As "abc".equalsIgnoreCase("true") is false.

    Boolean.valueOf("TrUe") => true. As "TrUe".equalsIgnoreCase("true") is true.

    Boolean.valueOf("false") => false. As "false".equalsIgnoreCase("true") is false.

    Boolean.valueOf(null) => false. As passed argument is null.

    Boolean.valueOf("FALSE") => false. As "FALSE".equalsIgnoreCase("true") is false.
 */