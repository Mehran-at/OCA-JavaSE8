package com.oca.arraysandarrayslist.thirtyfour;

class Test {

    public static void main(String[] args) {

//        for:
        for (int i = 2 ; i <= 100 ; i = i + 2) {
            for (int j = 1 ; j <= 10 ; j++) {
                System.out.println(i * j + "\t");
            }
            System.out.println();
//            if (i == 10) {
//                break for;
//            }
        }
    }
}
/*
    for is a keyword and hence can't be used as a label.

    Java labels follow the identifier naming rules and one rule is that we can't use java keywords as identifier.
    Hence, Compilation error.
 */