package com.oca.arraysandarrayslist.sixtyone;

import java.io.FileNotFoundException;

class Main {

    static String[] names = {"OCA.pdf", "OCP", "Pivotal", "Cloud-Services"};

    public static void main(String[] args) {

        try {
            if (search("virat.pdf")) // Arrays length is 4 and this method throws ArrayIndexOutOfBoundsException.
                System.out.println("FOUND");
        } catch (FileNotFoundException ex) {
            System.out.println("NOT FOUND");
        }
    }

    private static boolean search(String name) throws FileNotFoundException {

        for (int i = 0 ; i <= 4 ; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return true;
            }
        }
        throw new FileNotFoundException();
    }
}
/*
    search(String) method declares to throw FileNotFoundException, which is a checked exception. It returns true if
    match is found otherwise it throws an instance of FileNotFoundException.

    main(String[]) provides try-catch block around `search("virat.pdf")` and catch handler checks for
    FileNotFoundException. Given code compiles successfully.

    There are 4 elements in 'names' array, so starting index is 0 and end index is 3, but given for loop goes till
    index number 4.

    As search string is "virat.pdf" (not present in names array), hence for loop will execute for i = 0, 1, 2, 3, 4.

    For i = 4, `names[i].equalsIgnoreCase(name)` throws ArrayIndexOutOfBoundsException (it is a RuntimeException).
    main(String []) method doesn't provide handler for ArrayIndexOutOfBoundsException and therefore stack trace is
    printed on to the console and program terminates abruptly.
 */