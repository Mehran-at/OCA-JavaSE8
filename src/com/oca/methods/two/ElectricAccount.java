package com.oca.methods.two;

public class ElectricAccount {

    private double kwj;
    private double rate = 0.07;
    private double bill;

    public void addKwh(double kwh) {
//      no Minus on price << means the Kwh hour must not be lesser than previous value
        if (kwh > 0) {
            this.kwj += kwh;
            this.bill = this.kwj * this.rate;
        }
    }
}
