package com.oca.arraysandarrayslist.twenty;

class Test {

    public static void main(String[] args) {

        double[] arr = new double[2]; //Line 3. [0.0, 0.0]
//        double[] arr = new int[2]; //Line 3
        System.out.println(arr[0]); //Line 4. [0.0]
    }
}
/*
    int variable can easily be assigned to double type but double [] and int [] are not compatible. In fact, both are
    siblings and can't be assigned to each other, so Line 3 causes compilation failure.
 */