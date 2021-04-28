package com.oca.arraysandarrayslist.thirteenth;

class Test {

    public static void main(String[] args) {

        int[][] arr = new int[2][4]; //  [[0,0,0,0] , [0,0,0,0]]
        arr[0] = new int[] {1, 3, 5, 7}; //  [[1,3,5,7] , [1,0,0,0]] Here we create new Array[]
        arr[1] = new int[] {1, 3}; //  [[1,3,5,7] , [1,3]]  Here we create new Array[]
        for (int[] a : arr)
            for (int i : a)
                System.out.println(i + " "); // 1 3 5 7 1 3 0 0
    }
}
