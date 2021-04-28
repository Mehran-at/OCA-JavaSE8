package com.oca.arraysandarrayslist.seventyfour;

class Test {

    public static void main(String[] args) {

        String[][] stringArray = new String[2][];
        stringArray[0] = new String[2];
        stringArray[1] = new String[5];

        int i = 'a';
        for (int a = 0 ; a < stringArray.length ; a++) {
            for (int b = 0 ; b < stringArray.length ; b++) {
                stringArray[a][b] = " " + i;
                i++;
            }
        }
        for (String[] ca : stringArray) {
            for (String c : ca) {
                System.out.println(c + "");
            }
            System.out.println();
        }
        System.out.println(i);
    }
}
