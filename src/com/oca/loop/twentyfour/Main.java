package com.oca.loop.twentyfour;

class Main {

    public static void main(String[] args) {

        int i = 1;
        int j = 5;
        int k = 0;
        A:
        while (true) {
            i++;            // i= 2
            B:
            while (true) {
                j--;        // j = 2
                C:
                while (true) {
                    k += i + j;    // k = 15
                    if (i == j)
                        break A;
//                        break;
                    else if (i > j)
                        continue A;
                    else
                        continue B;
                }
            }
        }
        System.out.println(k);
    }
}
// The reason this code does not give compile error of unreachable code for like 30 is, break A; at line 20 breaks
// out the flow of the loop to the loop A and from the k will be printed.