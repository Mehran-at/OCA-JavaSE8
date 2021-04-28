package com.oca.arraysandarrayslist.fourtyseven;

class Main {

    public static void main(String[] args) {

        int[] arr1 = {111, 222, 333};
        char[] arr2 = {'A', 'a'};
//        arr1 = arr2;
        for (int i = 0 ; i < arr1.length ; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
/*
    Initially arr1 refers to an int array object of 3 elements: 1, 2, 3

    And arr2 refers to an char array object of 2 elements: 'A', 'B'.

    Statement arr1 = arr2; gives compilation error as char [] is not compatible with int [] even though char is
    compatible with int.
 */