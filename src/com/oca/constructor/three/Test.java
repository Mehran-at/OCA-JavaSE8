package com.oca.constructor.three;

class Test {

    public String color;

    public Test(String color) {
        /*INSERT*/
        this.color = color;
    }

    public static void main(String[] args) {

        Test apple = new Test("GREEN");
        System.out.println(apple.color);
    }
}
/*
    Instance variable color is shadowed by the parameter variable color of parameterized constructor. So, color = color
    will have no effect, because short hand notation within constructor body will always refer to LOCAL variable.
    To refer to instance variable, this reference is needed. Hence 'this.color = color;' is correct.

    'color = GREEN;' and 'this.color = GREEN;' cause compilation error as GREEN is not within double quotes("").

    NOTE: 'color = "GREEN";' will only assign 'GREEN' to local variable and not instance variable but
    'this.color = "GREEN";' will assign 'GREEN' to instance variable.
 */