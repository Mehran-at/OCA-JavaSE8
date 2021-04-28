package com.oca.inheritance.fourtysix;

class Sub extends Super {

//    private int var = 2000; // Line n2.

    int getVar() {

        return super.var; //Line n3. refer to its immediate parents variable of var
    }
}