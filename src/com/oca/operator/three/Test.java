package com.oca.operator.three;

class Test {

    public static void main(String[] args) {

        String str1 = new String("Core");
        String str2 = new String("CoRe");
        String str3 = new String("Core");
        System.out.println(str1 = str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}
