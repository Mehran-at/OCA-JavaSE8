package com.oca;

public class Customer {

    ElectricAccount acct = new ElectricAccount();

    public void useElectricity(double kWh) {

        acct.addkWh(kWh);
    }

}
