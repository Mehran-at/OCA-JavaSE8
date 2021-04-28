package com.oca.arraysandarrayslist.seventyfive;

class Test {

    public static void main(String[] args) {

        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr.length ; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j].equals("B")) {
                    break;
                }
            }
            continue; // Continue will not do anything as the last element in loop
        }
    }
}
