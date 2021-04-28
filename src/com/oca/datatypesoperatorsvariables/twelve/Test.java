package com.oca.datatypesoperatorsvariables.twelve;

class Test {

    public static void main(String[] args) {

        int ans;
        try {
            int num = 10;
            int div = 0;
            ans = num / div;
        } catch (ArithmeticException ex) {
            ans = 0;
            System.out.println("Arithmatic exception for ans= " + ans);
        } catch (Exception ex) {
            System.out.println("Invalid calculation");
        }
        System.out.println("Answer " /* + ans */); // ans might not be initialized
    }
}
