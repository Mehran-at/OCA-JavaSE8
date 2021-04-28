package com.oca.arraysandarrayslist.eleven;

class Main {

    public static void main(String[] args) {

        int n[][] = {{1, 3}, {2, 4}};
        int t = n.length;
        System.out.println("Here we get the number of Arrays in multi Dimensional Array n " + t);
        for (int i = n.length - 1 /* Here we need to reduce the Array's length by one as we need index */ ; i >= 0 ; i--) {
            for (int y : n[i]) {
                System.out.println(y);
            }
        }
    }
}
