package com.oca.datatypesoperatorsvariables.fourtythree;

class Test {

    public static void main(String[] args) {

        extractInt(2.9); // 2
//        extractInt(2);
        extractInt(2.0); // 2
    }

    private static void extractInt(Double obj) {

        System.out.println(obj.intValue());
    }
}
/*
    extractInt method accepts argument of Double type.

    extractInt(2.7); => 2.7 is double literal, so Java compiler would box it into Double type. At runtime obj.intValue()
    would print int portion of the Double data, which is 2.

    extractInt(2); => Java compiler either does implicit casting or Wrapping but not both. 2 is int literal, Java
    compiler can't implicit cast it to double and then box it to Double. So this statement causes compilation failure.
 */