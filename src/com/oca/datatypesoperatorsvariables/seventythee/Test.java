package com.oca.datatypesoperatorsvariables.seventythee;

class Test {

    int x;
    int y;

    public static void main(String[] args) {

        Test m1 = new Test();
        m1.x = 100;
        m1.y = 200;
        Test m2 = new Test();
        m2.doStuff(m1.x, m1.y); // (100, 200) m2.x = 100 m2.y= 0
        m1.display(); //  m1.x= 100 m1.y = 200  100 200:
        m2.display(); //  m2.x = 100 m2.y= 0    100 0:
    }

    public void doStuff(int x, int y) {

        this.x = x;
        y = this.y;
    }

    public void display() {

        System.out.println(x + " " + y + " : ");
    }
}