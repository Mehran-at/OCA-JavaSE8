package com.oca.datatypesoperatorsvariables.eleven;

class Test {

    String myStr = "007";

    public static void main(String[] args) {

        Test obj = new Test();
        obj.doStuff("666");
    }

    public void doStuff(String str) {

//        String myStr = "Local Variable."; /* This will clash with myStr var in try scope and cause compilation error. */
        int myNum = 0;
        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        } catch (NumberFormatException e) {
            System.err.println("Error");
        }
        System.out.println("myStr: " + myStr + " myNum: " + myNum);
    }
}
