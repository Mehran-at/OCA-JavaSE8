package com.oca.arraysandarrayslist.six;

import java.util.Arrays;

class Test {

    public static void main(String[] args) {

        String[] stringArray = new String[2];
//        stringArray[0] = "a";
//        stringArray[1] = "b";
        int idx = 0;
        for (String s : stringArray) {
            stringArray[idx] = stringArray[idx].concat(" Element " + idx);// This line cause NullpointerException
            idx++;
        }
        System.out.println(Arrays.toString(stringArray));


        StringBuilder[] stringBuilder = new StringBuilder[2];
        int idxx = 0;
        for (StringBuilder s : stringBuilder) {
            stringBuilder[idxx].append(" Element " + idxx);// This line cause NullpointerException
            idxx++;
        }
        System.out.println(Arrays.toString(stringBuilder));
    }
}