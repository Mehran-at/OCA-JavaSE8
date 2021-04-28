package com.oca.inheritance.sixtythree;

class Test {

    public static void main(String[] args) {

        Sub obj = new Sub();
        obj.NUM = 200; //Line n2
        System.out.println(obj.NUM); //Line n3

        Super super1 = new Super();
        System.out.println(super1.NUM);
    }
}
/*
    Variable NUM is declared in Super class and class Sub extends Super, hence NUM can be accessed by using obj.NUM.

    But as NUM Is final, hence it cannot be reassigned, therefore Line n2 causes compilation error. Let's check all
    the options one by one:

    Remove final modifier from Line n1 => ✓ Valid option and in this case output is 200.

    Replace INSERT with byte NUM; => ✗ In this case, class Sub hides the variable NUM of Super class but Line n2
    will still not compile as byte range is from -128 to 127 and 200 is out of range value.

    Replace INSERT with short NUM; => ✓ In this case, class Sub hides the variable NUM of Super class and 200 can
    be easily assigned to short type. In this case output is 200.

    Replace INSERT with int NUM; => In this case, class Sub hides the variable NUM of Super class and 200 can be
    easily assigned to int type. In this case output is 200.


    Replace INSERT with float NUM; => ✗ In this case, class Sub hides the variable NUM of Super class and 200 can be
    easily assigned to float type. But output in this case will be 200.0 and not 200.

    Replace INSERT with double NUM; => ✗ In this case, class Sub hides the variable NUM of Super class and 200 can
    be easily assigned to double type. But output in this case will be 200.0 and not 200.


    Replace INSERT with boolean NUM; => ✗ In this case, class Sub hides the variable NUM of Super class but Line
    n2 will still not compile as boolean type in java allows 2 values true and false. 200 is not compatible with
    boolean type.

    Replace INSERT with Object NUM; => ✓ In this case, class Sub hides the variable NUM of Super class and at Line
    n2, value 200 is boxed to Integer, which is then assigned to obj.NUM. So, obj.NUM refers to an instance of
    Integer class. Line n3 invokes toString() method of Integer class and hence 200 is printed on to the console.
 */