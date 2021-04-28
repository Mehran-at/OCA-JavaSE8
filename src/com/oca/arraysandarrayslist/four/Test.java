package com.oca.arraysandarrayslist.four;

class Test {

    public static void main(String[] args) {

        String[][] array = new String[2][];
        System.out.println("Before adding elements: " + array.length);
        array[0] = new String[2];
        array[1] = new String[5];

        int i = 'A'; // ASCII code for capital A is 65

        System.out.println("After adding elements: " + array.length);

        for (int a = 0 ; a < array.length ; a++) {
            for (int b = 0 ; b < array.length ; b++) {
                array[a][b] = "" + i;
                i++;
            }
        }
        for (String[] ca : array) {
            for (String c : ca) {
                System.out.println(c + " ");
            }
        }
    }
}