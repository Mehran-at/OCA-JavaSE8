package com.oca.constructor.seven;

class W extends D {

    String type;

    W(String type) {

        super(20); //default pages
        /*INSERT-1*/
        this.type = type;
    }

    W(int pages, String type) {
        /*INSERT-2*/
        this(type);
        super.pages = pages;
    }
}
//   print OCA,40
/*
    Java compiler adds super(); as the first statement inside constructor, if call to another constructor using
    this(...) or super(...) is not available.

    Compiler adds super(); as the first line in Word's constructor: Word(int pages, String type) { super(); } but
    Document class doesn't have a no-argument constructor and that is why Word's constructor `
    Word(int pages, String type)` causes compilation error.


    Word(String) constructor is actually not setting the passed type argument. Replace INSERT-1 with: `
    this.type = type;` will set the value to type variable.

    As the first statement inside Word(int pages, String type){} constructor, you can either have `super(pages);`
    or `this(type);` but not both.

    Replacing INSERT-2 with `super(pages);` will be redundant as in the next statement `super.pages = pages;`,
    pages variable of Document class is set. Hence, replacing INSERT-2 with `this(type);` is needed to set the type
    variable.
 */