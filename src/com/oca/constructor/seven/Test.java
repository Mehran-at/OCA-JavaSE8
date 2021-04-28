package com.oca.constructor.seven;

class Test {

    public static void main(String[] args) {

        W obj = new W(40, "OCA");
        System.out.println(obj.type + "," + obj.pages);

        W obj2 = new W( "OCA");
        System.out.println(obj2.type + "," + obj2.pages);
    }
}
//  Which of the options can successfully print OCA,25 on to the console?
/*
    Java compiler adds super(); as the first statement inside constructor, if call to another constructor using
    this(...) or super(...) is not available.

    Compiler adds super(); as the first line in Word's constructor: W(int pages, String type) { super(); } but
    Document class doesn't have a no-argument constructor and that is why W's constructor `W(int pages, String type)`
    causes compilation error.


    W(String) constructor is actually not setting the passed type argument. Replace INSERT-1 with: `this.type = type;`
    will set the value to type variable.

    As the first statement inside Word(int pages, String type){} constructor, you can either have `super(pages);` or
    `this(type);` but not both.

    Replacing INSERT-2 with `super(pages);` will be redundant as in the next statement `super.pages = pages;`,
    pages variable of Document class is set. Hence, replacing INSERT-2 with `this(type);` is needed to set the type
    variable.
 */