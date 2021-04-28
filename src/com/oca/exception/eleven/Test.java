package com.oca.exception.eleven;

class Test {

    public static void main(String[] args) {

        try {
            System.out.println(1);
        } catch (NullPointerException ex) { // RuntimeException
            System.out.println("ONE");
        } /* catch (FileNotFoundException ex) { /* ex is noe a checked exception and checked exception needs to be declared or handled.
            System.out.println("TWO");
        } */ catch (Exception ex) { /* Java allows to catch only Exception type from checked exception without declaring it.
                                        catch(Exception ex) {} will never cause compilation error here .*/
            System.out.println("TWO");
        }
        System.out.println("THREE");

        try {
            System.out.println("b");
            throw new IllegalArgumentException(); // RuntimeException
        } catch (RuntimeException c) {
            System.out.println("c");
        } finally {
            System.out.println("d");
        }
        System.out.println("e");
    }
}