package com.oca.objectequality.ten;

class Test {

    public static void main(String[] args) {

        String str = "Game on"; //Line n1
        StringBuilder sb = new StringBuilder(str); //Line n2

        System.out.println(str.contentEquals(sb)); //Line n3
//        System.out.println(sb.contentEquals(str)); //Line n4
        System.out.println(sb.equals(str)); //Line n5
        System.out.println(str.equals(sb)); //Line n6
    }
}
/*
    There are no issues with Line n1 and Line n2, both the statements compile successfully.

    String class contains contentEquals(CharSequence) method. Please note that String, StringBuilder and StringBuffer
    classes implement CharSequence interface, hence contentEquals(CharSequence) method defined in String class cab be
    invoked with the argument of either String or StringBuilder or StringBuffer.

    At Line n3, `str.contentEquals(sb)` is invoked with StringBuilder argument and hence it compiles fine. On execution
    it would compare the contents of String object and the passed StringBuilder object. As both the String object and
    StringBuilder object contains same content "Game on", hence on execution, Line n3 will print true.

    contentEquals method is not available in StringBuilder class and hence Line n4 causes compilation error.

    equals method declared in Object class has the declaration: `public boolean equals(Object)`. Generally, equals
    method is used to compare different instances of same class but if you pass any other object, there is no
    compilation error. Parameter type is Object so it can accept any Java object.

    `str.equals(sb)` => It compiles fine, String class overrides equals(Object) method but as 'sb' is of StringBuilder
    type so `str.equals(sb)` would return false at runtime.

    `sb.equals(str)` => It also compiles fine, StringBuilder class doesn't override equals(Object) method. So Object
    version is invoked which uses == operator, hence `sb.equals(str)` would return false as well at runtime.
 */
