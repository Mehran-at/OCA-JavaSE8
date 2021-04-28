package com.oca.loop.seven;

public class Switch {

    public static void main(String[] args) {

        int wd = 0;
        String days[] = {"sun", "mon", "wed", "sat"};
        for (String s : days) {
            switch (s) {
                case "sat":
                case "sun":
                    wd -= 1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd += 2;
            }
            System.out.print(wd + " ");
        }
        System.out.print("\'wd value is: " + wd + " \'");
    }
}
