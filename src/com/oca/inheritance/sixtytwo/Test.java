package com.oca.inheritance.sixtytwo;

class Test {

    public static void main(String[] args) {

        I1 obj = new C1();
//        obj.print("Java"); /* compilation error as it's not possible to access interface static method via object reference */
        I1.print("java");

        C1 obj1 = new C1();
        obj1.print("OCA");
    }
}
/*
    As per Java 8, default and static methods were added in the interface. Interface I1 defines static method
    print(String), there is no compilation error in interface I1.

    Also the scope of print(String) method of I1 is limited to interface I1 and it can be invoked by using Interface
    name only, I1.print("").

    class C1 implements I1 and it also defines print(String) instance method. Even though class C1 implements I1, it
    doesn't have static print(String) method in its scope, therefore class C1 compiles successfully.

    Super type reference variable can refer to an instance of Sub type, therefore the statement `I1 obj = new C1();`
    compiles successfully.

    obj is of I1 type, hence `obj.print("Java");` tries to tag the static method of I1 but static print(String) method
    of I1 can only be invoked by using I1.print("Java");.

    Therefore, `obj.print("Java");` causes compilation error.
 */