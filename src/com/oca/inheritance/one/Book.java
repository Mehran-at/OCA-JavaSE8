package com.oca.inheritance.one;

abstract class Book implements Readable {

    public void readBook() {

        System.out.println("read e-book");
    }

    public abstract void setBookMark();
}