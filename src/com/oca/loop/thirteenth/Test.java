package com.oca.loop.thirteenth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test {

    public static void main(String[] args) {

        String[] names = {"Smith", "Brown", "Thomas", "Taylor", "Jones"};
        List<String> list = new ArrayList<>();
        for (int x = 0 ; x < names.length ; x++) { // ( 0  ;  < 5  ;   )
            list.add(names[x]); // ["Smith",,,,]
            switch (x) {
                case 2:
                    continue;
            }
            break;
        }
        System.out.println(list.size());
        System.out.println(list);
    }
}
