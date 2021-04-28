package com.oca;

public class ElectricAccount {

    private double kWh;
    private double rate = 0.07;
    private double bill;

    public void addkWh(double kWh) {
        if (kWh > 0) {
            this.kWh += kWh;
            this.bill= kWh * this.rate;
        }
    }
}
