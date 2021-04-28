package com.oca.objectequality.eleven;

class Test {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        String str2 = str1;
        String str3 = "Duke";
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
}
