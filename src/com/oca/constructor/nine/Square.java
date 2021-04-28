package com.oca.constructor.nine;

class Square {

    int length;
    Square sq;

    Square(int length) {

        this.length = length;
    }

    void setInner(Square sq) {

        this.sq = sq;
    }

    int getLength() {

        return this.length;
    }

    @Override
    public String toString() {

        return "Square{" + "length=" + length + ", sq=" + sq + '}';
    }
}
