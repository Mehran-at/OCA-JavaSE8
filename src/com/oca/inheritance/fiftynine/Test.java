package com.oca.inheritance.fiftynine;

class Test {

    public static void main(String[] args) {

        Document doc = new Word(); //Line n1
        System.out.println(doc.getType()); //Line n2
    }
}
/*
    As per Java 8, default methods were added in the interface. Interface Document defines default method getType(),
    there is no compilation error in interface Document. Method getType() is implicitly public in Document.

    interface WordDocument extends Document and it overrides the default method getType() of Document, overriding method
    in WordDocument is implicitly abstract and public. An interface in java can override the default method of super
    type with abstract modifier. interface WordDocument compiles successfully.

    class Word implements WordDocument and as WordDocument interface has abstract method getType(), and as class Word
    doesn't implement the getType() method hence it causes compilation failure.
 */