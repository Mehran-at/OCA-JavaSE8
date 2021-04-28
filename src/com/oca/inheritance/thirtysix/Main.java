package com.oca.inheritance.thirtysix;

class Main {

    public static void main(String[] args) {

        C m = new C();
    }
}
/*
    As per Java 8, default and static methods were added in the interface. Interface I defines static method B(),
    there is no compilation error in interface I.

    Abstract class B defines the static B() method. Abstract class can have 0 or more abstract methods. Hence, no
    compilation error in class B as well.

    Default methods of an interface are implicitly public and are inherited by the implementer class. Class C
    implements I interface and therefore it inherits the default log() method of I interface.

    Also, the scope of static log() method of abstract class B is not limited to class B only but C also
    gets B.log() method in its scope.

    So, C class has instance method log() [inherited from I interface] and static method log() [from B class]
    and this causes conflict. Static and non-static methods with same signature are not allowed in one scope, therefore
    class C fails to compile.
 */