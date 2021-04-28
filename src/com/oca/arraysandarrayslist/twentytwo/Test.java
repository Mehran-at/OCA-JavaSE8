package com.oca.arraysandarrayslist.twentytwo;

class Test {

    public static void main(String[] args) {
//        byte [] arr = new byte[10]; // [0,0,0,0,0,0,0,0,0,0]
//        short [] arr; arr = new short[3]; //[0,0,0]
        int [] arr = new int[]{0, 0, 0, 0};
        arr[1] = 5;// [0, 5, 0, 0]
        arr[2] = 10;// [0, 5, 10, 0]
        System.out.println("[" + arr[1] + ", " + arr[2] + "]"); //Line n1
    }
}
/*
    1. short arr [] = new short[2]; => ✗

    You can declare one-dimensional array by using either "short arr []" or "short [] arr". 'arr' refers to a short
    array object of 2 elements. arr[2] will throw ArrayIndexOutOfBoundsException at runtime.



    2. byte [] arr = new byte[10]; => ✓

    'arr' refers to a byte array object of 10 elements, where 0 is assigned to each array element. But later on element
    at 1st and 2nd indexes have been re-initialized. Line n1 successfully prints [5, 10] on to the console.



    3. short [] arr; arr = new short[3]; => ✓

    You can create an array object in the same statement or next statement. 'arr' refers to a short array object of 3
    elements, where 0 is assigned to each array element. Later on element at 1st and 2nd indexes have been re-initialized.
    Line n1 successfully prints [5, 10] on to the console.



    4. short [2] arr; ✗

    Array size cannot be specified at the time of declaration, so short [2] arr; causes compilation error.



    5. short [3] arr; ✗

    Array size cannot be specified at the time of declaration, so short [3] arr; causes compilation error.



    6. int [] arr = new int[]{100, 100}; => ✗

    'arr' refers to an int array object of size 2 and both array elements have value 100. arr[2] will throw
    ArrayIndexOutOfBoundsException at runtime.



    7. int [] arr = new int[]{0, 0, 0, 0}; => ✓

    'arr' refers to an int array object of size 4 and all array elements have value 0. Later on element at 1st and 2nd
    indexes have been re-initialized. Line n1 successfully prints [5, 10] on to the console.



    8. short [] arr = {}; => ✗

    'arr' refers to a short array object of 0 size. so arr[1] will throw ArrayIndexOutOfBoundsException at runtime.



    9. short [] arr = new short[2]{5, 10}; => ✗

    Array's size can't be specified, if you use {} to assign values to array elements.

    Hence, out of the given 9 statements, only 3 will print [5, 10] on to the console.
 */