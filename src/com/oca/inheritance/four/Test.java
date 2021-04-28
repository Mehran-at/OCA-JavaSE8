package com.oca.inheritance.four;

class Test extends C {

    public void readBook() {
        System.out.println("Read E-Book");
    }

    public void download() {
        System.out.println("Download the Book");
    }

    public static void main(String[] args) {
        C book1 = new Test();
        book1.readBook();
        book1.download();
    }
}
//Read E-Book
//Download the Book