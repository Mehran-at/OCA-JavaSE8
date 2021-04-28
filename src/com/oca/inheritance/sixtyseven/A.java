package com.oca.inheritance.sixtyseven;

interface A {

    int salePercentage = 85; //implicitly public static final

    public static String salePercentage() { // can not be overridden and access only via interface name

        return salePercentage + "%";
    }
}