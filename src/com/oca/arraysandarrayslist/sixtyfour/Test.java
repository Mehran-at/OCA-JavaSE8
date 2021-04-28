package com.oca.arraysandarrayslist.sixtyfour;

import java.util.Arrays;

class Test {

    public static void main(String[] args) {

        int var = 3;
        String[][] arr = new String[--var][var++]; //   Line n1
//        String[][] arr = new String[2][3]; //   val = 3
        arr[0][0] = "W";
        arr[0][1] = "M";
//        arr[1][2] = "W"; //Line n3
//        arr[1][1] = "M"; //Line n3
        /* Up two lines of code(n3) cause an ArraysIndexOutOfBoundException, as it does not follow the rule of adding
         elements to an array in has to be in order. You can ignore this rule in case Arrays are of primitive types
        and have default values. */
        for (String[] arr1 : arr) {
            for (String s : arr1) {
                if (s != null)
                    System.out.print(s);
            }
        }
        System.out.println(Arrays.deepToString(arr));

        System.out.println("\n");

        int varr = 3;
        int[][] arrays1 = new int[varr++][--varr]; //[3][3]
        arrays1[2][2] = 22;
        arrays1[1][2] = 24;
        for (int[] number : arrays1) {
            for (int num : number) {
                System.out.print(num);
            }
        }
        System.out.println(Arrays.deepToString(arrays1));
    }
}
/*
    Line n1:

    String [][] arr = new String[--var][var++]; //var = 3

    Access array element operator [] is left to right associative.

    => String [][] arr = new String[2][var++]; //var = 2, var is decremented first and then used in the expression.

    => String [][] arr = new String[2][2]; //var = 3, value of var is used first and then it is incremented by 1

    Hence, arr refers to 2-dimensional String array object {{null, null}, {null, null}}.

    At Line n2, arr[1][1] = "X"; assigns "X" to element at index [1][1], therefore arr --> {{null, null}, {null, "X"}}

    At Line n3, arr[1][2] = "Y"; causes ArrayIndexOutOfBoundsException as 2nd index 2 is out of range.

    As Line n3 throws Exception at runtime, hence for loop will not be executed.
 */