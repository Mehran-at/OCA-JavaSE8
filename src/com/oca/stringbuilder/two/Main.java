package com.oca.stringbuilder.two;

class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("ABCDF");
//        sb.deletAll(); we don't have such a method for StringBuilder
//        sb.delete(0, sb.size()); /* to get size of StringBuilder we need sb.length() not sb.size() */
        sb.delete(0, sb.length());
        sb.replace(1, 3, "String");
//        sb.remove(); /* we don't have such a method for StringBuilder delete method */
        System.out.println("And now sb is=" + sb + "=empty.");
    }
}
