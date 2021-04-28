package com.oca.inheritance.fiftynine;

class Word implements WordDocument {

    @Override
    public String getType() {

        return "child interface can extend a parent interface and also override defaults parent method in itself with an"
                + " abstract method.";
    }
}
