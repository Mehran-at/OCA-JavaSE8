package com.oca.arraysandarrayslist.sixtyfive;

class Test {

    public static void main(String[] args) {

        String arrA[], arrB[], arrC[] = null;
        arrA = arrB = arrC;

        String arr1[], arr2, arr3 = null; /* Line n1 arr1 is an Array, but arr2 and arr3 are of String type. As these are
        not the same type, it's not possible to assign these to each other directly. */
        arr1 = new String[2];
        arr1[0] = "A";
        arr1[1] = "B";
        // arr2 = arr3 = arr1; //Line n2
        log(arr1); //Line n3
        // log(arr2); //Line n3
        log(arr3); //Line n3
    }

    private static void log(String... varArgs) {

        for (String stringElement : varArgs)
            System.out.print(stringElement);
    }
}
/*
    arr1 is of String[] type, where as arr2 and arr3 are of String type. As all three arr1, arr2 and arr3 are of
    reference type, hence null can be assigned to all these variables. Line n1 compiles successfully.

    Statement at Line n2: arr2 = arr3 = arr1;

    => arr2 = (arr3 = arr1); //assignment operator is right to left associative.

    arr3 is of String type and arr1 is of String [] type, hence (arr3 = arr1) causes compilation error.

    Though you had to select one correct option, hence no need to look further but I am providing explanation for Line
    n3 as well.

    log(String...) method can be called using a String [] or a String instance or mutliple String instances:

    log(new String[] {"A", "B"});

    log("A");

    log("A", "B");

    As arr2 is of String type, hence `log(arr2);` (Line n3) compiles successfully.
 */