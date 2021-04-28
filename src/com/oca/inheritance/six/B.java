package com.oca.inheritance.six;

class B extends A {

    String model;

    B(String model) {
        this("A", 200, model);
    }

    B(String type, int maxSpeed, String model) {
        super(type, maxSpeed);
        this.model = model;
    }

    public static void main(String[] args) {
        B car1 = new B("M5");
        System.out.println(car1); // Car{M5 , A , 200}

        B car = new B("BMW", 280, "M3");
        System.out.println(car); // Car{M3 , BMW , 280}

        B c1 = new B("GT"); //"A" 200 GT
        System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.model); // A 200 GT
        B c2 = new B("4W", 150, "AMG"); // 4w 150 AMG
        System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.model); // 4w 150 Manual

        A aaa = new A("Unknown", 125);
        B bbb = (B)aaa; // ClassCastException
    }

    @Override
    public String toString() {
        return "Car {" + "model='" + model + '\'' + ", type='" + type + '\'' + ", maxSpeed=" + maxSpeed + '}';
    }
}
