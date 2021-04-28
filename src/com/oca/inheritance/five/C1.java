package com.oca.inheritance.five;

class C1 extends C2 implements I {

    public static void main(String[] args) {

        C2 obj1 = new C1();
        I obj2 = new C1();
        C1 c1 = new C1();
//        C1 c1 = new C2(); subtype can refer to supertype

        I tt = c1;
        C2 ss = c1;

//        C2 s = obj2;
//        I t = obj1;
        System.out.println("------------------------");
        I t = (C1) obj1;
        C2 s = (C1) obj2;

        t.displayI();
        s.displayII();
        System.out.println("------------------------");

        ((C2) obj2).displayII();
        ((I) obj1).displayI();

        obj1.displayII();
        obj2.displayI();
    }

    public void displayI() {

        System.out.println("C1");
    }
}
