package com.oca.inheritance.fiftynine;

interface Document {

    default String getType() {

        return "TEXT";
    }
}
