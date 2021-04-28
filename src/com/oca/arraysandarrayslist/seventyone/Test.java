package com.oca.arraysandarrayslist.seventyone;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Test {

    public static void main(String[] args) {

        int[] random = {6, -4, 12, 0, -10};
        int x = -10;
        int y = Arrays.binarySearch(random, x); /* Arrays.binarySearch get two parameters, (Object[], Object Key). If
        Array is not sorted, the result will be undefined */
        System.out.println(y);

        Arrays.sort(random);
        System.out.println(Arrays.toString(random));
        int ySorted = Arrays.binarySearch(random, x);
        System.out.println(ySorted);


        List<String> nums = Arrays.asList("50", "30", "60", "41", "40");
        Collections.sort(nums);
        System.out.println(nums);
    }
}
