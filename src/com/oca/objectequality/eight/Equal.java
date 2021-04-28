package com.oca.objectequality.eight;

class Equal {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String("Java");
        String str3 = str2;
        if (str1.equals(str3)) {
            System.out.println("Equal");
        }
        if (str1.equals(str2)) {
            System.out.println("Again Equal");
        } else {
            System.out.println("Not equal!");
        }
    }
}
