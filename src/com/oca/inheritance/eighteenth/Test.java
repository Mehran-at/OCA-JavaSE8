package com.oca.inheritance.eighteenth;

class Test {

    public static void main(String[] args) {

        B obj = new B(128, "TYPE-C");
        System.out.println(obj.capacity + ":" + obj.type);

        A obj2 = new B("USB");
        System.out.println(obj2.capacity);

        B obj3 = new B("Charger");
        System.out.println(obj3.capacity + ":" + obj3.type + ":" + obj3.make);
    }
}
