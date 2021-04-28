package com.oca.switchstatement.four;

class Main {

    public static void main(String[] args) {

        String fruit = new String(new char[] {'M', 'a', 'n', 'g', 'o'});
        System.out.println(fruit); // Mango
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO"); // MANGO
            case "Banana":
                System.out.println("BANANA"); // BANANA
        }
    }
}
