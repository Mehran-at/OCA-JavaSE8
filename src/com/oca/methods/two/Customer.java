package com.oca.methods.two;

class Customer {

    ElectricAccount acct = new ElectricAccount();

    public void useElectricity(double kwh) {

        acct.addKwh(kwh);
    }
}
