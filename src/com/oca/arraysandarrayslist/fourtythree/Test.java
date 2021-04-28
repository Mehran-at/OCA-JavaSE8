package com.oca.arraysandarrayslist.fourtythree;

class Test {

    public static void main(String[] args) {

        String message = "The day that never comes!";

        boolean[] flag = new boolean[0];
        if (flag[1]) {
//        if (flag[0]) {
            message = "Singer name? ";
        }
        System.out.println(message);
    }
}
/*
    Variable message is referring to String object "Hello". There is only one element in boolean array object and it is
    initialized to default value of boolean, which is false. flag[0] is false, if-check fails and control doesn't enter
    if block. System.out.println(message) prints original value of message, which is "The day that never comes!".
 */
