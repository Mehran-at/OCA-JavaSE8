package com.oca.arraysandarrayslist.seventythree;

class Test {

    public static void main(String[] args) {

        String[] stringArray = new String[2]; // [null, null]
        int index = 0;
        for (String s : stringArray) {
//            System.out.println(stringArray[index] + "");
            String nullElement = stringArray[0];
            nullElement.concat(" Element " + index); /* Here executing concat method on a null value element, cause
            compilation error */
            index++;
        }
    }
}
