package com.oca.inheritance.fourteenth;

class Test extends B implements A {

    public static void main(String[] args) {

        B aTool = new Test();
        B bTool = new B();
        callExpert(aTool);
        callExpert(bTool);
    }

    public static void callExpert(A ex) {

        ex.export();
    }

    public void export() {

        System.out.println("RTool::export");
    }
}
