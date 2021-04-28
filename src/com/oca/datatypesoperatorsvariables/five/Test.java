package com.oca.datatypesoperatorsvariables.five;

class Test {

    public static void change(Message m) { //Line n5

        m = new Message(); //Line n6
        m.msg = "Wait, When was your birthday!"; //Line n7
    }

    public static void main(String[] args) {

        Message obj = new Message(); //Line n1
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4
    }
}
/*
    Java is pass-by-reference. So initially, msg = "Happy Valentine's day!"

    Call to method change(Message) doesn't modify the msg property of passed object rather it creates another Message
    object and modifies the msg property of new object to "Wait, When was your birthday!"

    So, the instance of Message referred by obj remains unchanged.

    Hence in the output, you get:
                                Happy Valentine's day!
                                Happy Valentine's day!
 */