package com.oca.loop.twentyfive;

class Test {

    public static void main(String[] args) {

        try {
            play();
            return;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return;
        } finally {
            System.out.println("MATCH ABANDONED");
        }
        // System.out.println("DONE");
    }

    static void play() throws Exception {

        throw new Exception("INJURED");
    }
}
/*
    Both try and catch blocks have return; statement, which means either of the return statements will definitely get
    executed. Hence, compiler tags `System.out.println("DONE");` as unreachable and this causes compilation error.
 */