package com.oca.datatypesoperatorsvariables.seventeenth;

class Test {

    private static String creditCardNumMask(String creditCard) {

        String creditCardNumMock = "XXXX-XXXX-XXXX-";

        StringBuilder builder = new StringBuilder(creditCardNumMock);
        builder.append(creditCard, 15, 19);
        return builder.toString();
    }

    public static void main(String[] args) {

        System.out.println(creditCardNumMask("1234-5678-9101-1121"));
    }
}