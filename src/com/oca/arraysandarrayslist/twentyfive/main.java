package com.oca.arraysandarrayslist.twentyfive;

class main {

    public static void main(String[] args) {

        int ctr = 10;
        char[] arrC1 = new char[] {'p', 'a', 'u', 'l'};
        char[] arrC2 = {'H', 'a', 'r', 'r', 'y'};
        for (char c1 : arrC1) {
            for (char c2 : arrC2) {
                if (c2 == 'a')
                    break;//Take the control out of the inner loop
                ++ctr;
            }
        }
        System.out.println(ctr);
    }
}
